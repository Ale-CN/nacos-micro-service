package com.ale.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name: Server1App
 * @Description: TODO
 * @Author: LuJiaLe
 * @Date: 2020/06/25 22:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Server1App {
    public static void main(String[] args) {
        SpringApplication.run(Server1App.class, args);
    }
}
