package com.example.cybersecurityawareness;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@MapperScan("com.example.cybersecurityawareness.mapper")
public class CyberSecurityAwarenessApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyberSecurityAwarenessApplication.class, args);
    }

}
