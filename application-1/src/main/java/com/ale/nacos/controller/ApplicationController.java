package com.ale.nacos.controller;

import com.ale.nacos.ProviderService;
import com.ale.nacos.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name: ApplicationController
 * @Description: TODO
 * @Author: LuJiaLe
 * @Date: 2020/06/25 17:44
 */
@RestController
public class ApplicationController {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    // 注入service(基于dubbo协议)
    @org.apache.dubbo.config.annotation.Reference
    private ConsumerService consumerService;

    // 注入service(基于dubbo协议)
    @org.apache.dubbo.config.annotation.Reference
    private ProviderService providerService;

    @GetMapping("/dubboConsumer")
    public String dubboConsumer(){
        return consumerService.consumer();
    }

    @GetMapping("/dubboProvider")
    public String dubboProvider(){
        return providerService.provider();
    }


    @GetMapping("/service")
    public String service() {
        logger.info("service...");
        return applicationContext.getEnvironment().getProperty("name");
    }

}
