package com.ale.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name: TestController
 * @Description: TODO
 * @Author: LuJiaLe
 * @Date: 2020/06/25 23:57
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${zuul.routes.application1.path}")
    private String path;

    @GetMapping("/test")
    public String test(){
        return "test " + path;
    }
}
