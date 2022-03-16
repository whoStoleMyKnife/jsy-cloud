package com.jsy.cloud.provider.demo.service.impl;

import com.jsy.cloud.api.demo.DemoReq;
import com.jsy.cloud.api.demo.DemoResp;
import com.jsy.cloud.api.demo.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public DemoResp test(DemoReq request) {
        return DemoResp.newBuilder().setBody("body").build();
    }
}
