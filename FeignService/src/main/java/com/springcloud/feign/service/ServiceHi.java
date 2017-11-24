package com.springcloud.feign.service;

import com.springcloud.feign.service.impl.ServiceHiHystrixImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zuoliangliang on 2017/11/23.
 */
@FeignClient(value = "service-hi",fallback = ServiceHiHystrixImpl.class)
public interface ServiceHi {

    @RequestMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
