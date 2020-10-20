package com.ql;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author qinlei
 * @description todo
 * @date 2020/10/20 15:08
 */
@SpringBootApplication
@EnableDubbo
@EnableHystrix  //开启熔断器服务
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
