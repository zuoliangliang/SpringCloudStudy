package com.springcloud.feign.service.impl;

import com.springcloud.feign.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by zuoliangliang on 2017/11/23.
 */
@Component
public class ServiceHiHystrixImpl implements ServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
