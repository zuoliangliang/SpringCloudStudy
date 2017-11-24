package com.springcloud.feign.Controller;

import com.springcloud.feign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zuoliangliang on 2017/11/23.
 */
@RestController
public class HiController {

    @Autowired
    ServiceHi serviceHi;


    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return serviceHi.sayHiFromClientOne(name);
    }
}
