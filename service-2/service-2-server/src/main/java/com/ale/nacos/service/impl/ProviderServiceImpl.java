package com.ale.nacos.service.impl;

import com.ale.nacos.ProviderService;

/**
 * @Name: ProviderServiceImpl
 * @Description: TODO
 * @Author: LuJiaLe
 * @Date: 2020/06/25 23:17
 */
@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
    public String provider() {
        return "ProviderService Invoke...";
    }
}
