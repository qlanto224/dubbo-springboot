package com.ql.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ql.Service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinlei
 * @description todo
 * @date 2020/10/20 15:01
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @DubboReference(version = "1.0.0")
    private HelloService helloService;

    @HystrixCommand(fallbackMethod = "hello")
    @RequestMapping(value = "sayHello")
    public String sayHello(){
        String s = helloService.sayHello();
        System.out.println(s);
        return s;
    }
    /**
     * 服务熔断的回调方法
     */
    public String hello(){
        System.out.println("服务熔断了...");
        return ("服务熔断了...");
    }
}
