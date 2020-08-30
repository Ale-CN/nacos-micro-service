package com.ale.nacos.service.impl;

import com.ale.nacos.ProviderService;
import com.ale.nacos.service.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @Name: ConsumerServiceImpl
 * @Description: TODO
 * @Author: LuJiaLe
 * @Date: 2020/06/25 22:57
 */
@org.apache.dubbo.config.annotation.Service // 使用的时dubbo提供的Service注解
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    private ProviderService providerService;

    public String consumer() {
        return "ConsumerService Invoke..." + providerService.provider();
    }
}
