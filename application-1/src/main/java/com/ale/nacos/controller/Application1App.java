package com.ale.nacos.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name: Application1App
 * @Description: TODO
 * @Author: LuJiaLe
 * @Date: 2020/06/25 23:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application1App {
    public static void main(String[] args) {
        System.out.println(" start ...");

        SpringApplication.run(Application1App.class, args);
    }
}
