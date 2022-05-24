package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {
    @Value("${userValue: default}")
    private String userValue;


    @GetMapping("/hello")
    public String hello() {
        return "hello service01: "+userValue;
    }
}
