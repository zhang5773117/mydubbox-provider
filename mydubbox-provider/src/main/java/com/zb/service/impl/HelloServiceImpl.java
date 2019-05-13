package com.zb.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zb.service.HelloService;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class HelloServiceImpl implements HelloService {

    @HystrixCommand
    public String sayHello(String name) {
        // TODO Auto-generated method stub
        System.out.println("提供服务old----->1");
        if(Math.random()>0.5){
            throw  new RuntimeException("错误了");
        }
        return "hello:--->" + name;
    }

}
