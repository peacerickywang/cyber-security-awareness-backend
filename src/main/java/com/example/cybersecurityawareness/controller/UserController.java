package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cybersecurityawareness.model.User;
import com.example.cybersecurityawareness.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@Api(tags = "User API")
@RestController
@RequestMapping("api")
public class UserController extends BaseController {
    String HASH_ALGORITHM_TYPE = "MD5"; //加密方式
    int HASH_ITERATION = 2; //加密的次数
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @ApiOperation("User Register")
    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
    public JSONObject register(@RequestParam("email") String email, @RequestParam("password") String password) {
        User user = userService.selectUserByEmail(email);
        if (user != null) {
            return requestResponse(false,"Account exists");
        }
        user = new User();
        user.setEmail(email);
        /**
         * SALT VALUE
         */
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
        /**
         * ENCRYPT
         */
        SimpleHash simpleHash = new SimpleHash(HASH_ALGORITHM_TYPE, password, salt, HASH_ITERATION);
        String encryptionPassword = simpleHash.toString();
        user.setSalt(salt);
        user.setPassword(encryptionPassword);
        Calendar calendar = Calendar.getInstance();
        user.setCreatetime(calendar.getTime());
        try {
            userService.insertSelective(user);
        } catch (Exception e) {
            e.printStackTrace();
            return requestResponse(false,e.getMessage());
        }
        return requestResponse(true,"Register success.");
    }

    @ApiOperation("User Login")
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public JSONObject login(User user) {
        if (StringUtils.isEmpty(user.getEmail()) || StringUtils.isEmpty(user.getPassword())) {
            return requestResponse(false,"Please enter Email or Password.");
        }
        //用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getEmail(),
                user.getPassword()
        );
        try {
            subject.login(usernamePasswordToken);
        } catch (UnknownAccountException e) {
            return requestResponse(false,"No account exists.");
        } catch (AuthenticationException e) {
            return requestResponse(false,"Authentication failed.");
        } catch (AuthorizationException e) {
            return requestResponse(false,"Authorization failed.");
        }
        return requestResponse(true,"Login success.");
    }

    @ApiOperation("User Logout")
    @RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return redirect("login");
    }
}
