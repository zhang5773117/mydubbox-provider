package com.zb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class MydubboxProviderApplication {

    public static void main(String[] args) {
        //一段测试
        SpringApplication.run(MydubboxProviderApplication.class, args);
    }

}
