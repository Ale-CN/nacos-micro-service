package com.ale.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name: Server2App
 * @Description: TODO
 * @Author: LuJiaLe
 * @Date: 2020/06/25 23:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Server2App {
    public static void main(String[] args) {
        SpringApplication.run(Server2App.class, args);
    }
}
