package com.team.ddbuy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.ddbuy.service.TestService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {
    @Override
    public String TestHw() {
        return "First Test";
    }
}
