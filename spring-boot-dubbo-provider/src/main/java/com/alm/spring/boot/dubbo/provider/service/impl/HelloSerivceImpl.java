package com.alm.spring.boot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alm.spring.boot.dubbo.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author mosl
 * @create 2018-02-19 下午4:53
 **/
@Service(interfaceClass = HelloService.class)
@Component
public class HelloSerivceImpl implements HelloService {



    @Override public String sayHello() {
        return "Hello";
    }
}