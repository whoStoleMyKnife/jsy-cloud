package com.jsy.cloud.bff.demo.controller;

import com.jsy.cloud.api.demo.DemoReq;
import com.jsy.cloud.api.demo.DemoResp;
import com.jsy.cloud.api.demo.DemoService;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @DubboReference(check = false)
    private DemoService demoService;

    @GetMapping
    public String body(Integer param) {
        return demoService.test(DemoReq.newBuilder().setParam(param).build()).getBody();
    }
}
