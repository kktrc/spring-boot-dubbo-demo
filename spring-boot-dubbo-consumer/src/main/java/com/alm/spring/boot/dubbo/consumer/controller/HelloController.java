package com.alm.spring.boot.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mosl
 * @create 2018-02-19 下午4:59
 **/
@RestController
public class HelloController {


    @Autowired private HelloConsumer helloConsumer;


    @GetMapping(value = "/sayHello")
    public Object sayHello() {

        return helloConsumer.sayHello();
    }


}