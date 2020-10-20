package com.ql.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ql.Service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author qinlei
 * @description todo
 * @date 2020/10/20 14:52
 */
@DubboService(version = "1.0.0")
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    @HystrixCommand //表示该方法被hystrix代理了,出现异常就会熔断
    public String sayHello() {
        return "服务被成功调用了";
    }
}
