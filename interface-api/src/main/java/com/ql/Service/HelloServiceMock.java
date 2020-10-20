package com.ql.Service;

/**
 * @author qinlei
 * @description todo
 * @date 2020/10/20 15:20
 */
public class HelloServiceMock implements HelloService{
    @Override
    public String sayHello() {
        System.out.println("服务调用失败...");
        return null;
    }
}
