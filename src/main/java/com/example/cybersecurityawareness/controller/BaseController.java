package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cybersecurityawareness.Utils.DateEditor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class BaseController {
    @Autowired
    public HttpServletRequest request;

    @Autowired
    public HttpServletResponse response;


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        webDataBinder.registerCustomEditor(Date.class, new DateEditor(true));
    }

    /**
     * 带参重定向
     *
     * @param path
     * @return
     */
    public String redirect(String path) {
        return "redirect:" + path;
    }

    /**
     * 不带参重定向
     *
     * @param response
     * @param path
     * @return
     */
    public String redirect(HttpServletResponse response, String path) {
        try {
            response.sendRedirect(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取分页请求
     *
     * @return
     */
    public PageRequest getPageRequest() {
        int page = 1;
        int size = 10;
        Sort sort = null;
        try {
            String sortName = request.getParameter("sortName");
            String sortOrder = request.getParameter("sortOrder");
            if (StringUtils.isNoneBlank(sortName) && StringUtils.isNoneBlank(sortOrder)) {
                if (sortOrder.equalsIgnoreCase("desc")) {
                    sort = Sort.by(Sort.Direction.DESC, sortName);
                } else {
                    sort = Sort.by(Sort.Direction.ASC, sortName);
                }
            }
            if (!org.springframework.util.StringUtils.isEmpty(request.getParameter("pageNumber"))) {
                page = Integer.parseInt(request.getParameter("pageNumber")) - 1;
                size = Integer.parseInt(request.getParameter("pageSize"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        PageRequest pageRequest = PageRequest.of(page, size, sort);
        return pageRequest;
    }

    /**
     * 获取分页请求
     *
     * @param sort 排序条件
     * @return
     */
    public PageRequest getPageRequest(Sort sort) {
        int page = 0;
        int size = 10;
        try {
            if (null == sort) {
                String sortName = request.getParameter("sortName");
                String sortOrder = request.getParameter("sortOrder");
                if (StringUtils.isNoneBlank(sortName) && StringUtils.isNoneBlank(sortOrder)) {
                    if (sortOrder.equalsIgnoreCase("desc")) {
                        sort.and(Sort.by(Sort.Direction.DESC, sortName));
                    } else {
                        sort.and(Sort.by(Sort.Direction.ASC, sortName));
                    }
                }
            }
            if (!org.springframework.util.StringUtils.isEmpty(request.getParameter("pageNumber"))) {
                page = Integer.parseInt(request.getParameter("pageNumber")) - 1;
                size = Integer.parseInt(request.getParameter("pageSize"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageRequest pageRequest = PageRequest.of(page, size, sort);
        return pageRequest;
    }

    public JSONObject requestResponse(boolean result, Object content) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", result);
        jsonObject.put("message", content);
        return jsonObject;
    }
}
