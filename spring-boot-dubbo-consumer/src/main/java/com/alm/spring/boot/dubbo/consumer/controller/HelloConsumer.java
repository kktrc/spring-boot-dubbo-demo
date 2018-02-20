package com.alm.spring.boot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alm.spring.boot.dubbo.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author mosl
 * @create 2018-02-19 下午6:43
 **/
@Component
public class HelloConsumer {

    @Reference(check = false)
    private HelloService helloService;


    public String sayHello() {

        return helloService.sayHello();
    }
}