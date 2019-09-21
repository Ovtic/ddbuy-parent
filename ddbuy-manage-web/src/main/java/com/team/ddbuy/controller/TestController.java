package com.team.ddbuy.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.team.ddbuy.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Reference(interfaceClass = TestService.class)
    private TestService service;

    @RequestMapping("/FirstTest")
    public String firstTest(){
        return service.TestHw();
    }
}
