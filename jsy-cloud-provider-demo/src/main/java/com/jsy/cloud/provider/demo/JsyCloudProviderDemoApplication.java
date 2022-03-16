package com.jsy.cloud.provider.demo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.jsy.cloud.provider.demo.service.impl")
public class JsyCloudProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsyCloudProviderDemoApplication.class, args);
    }
}
