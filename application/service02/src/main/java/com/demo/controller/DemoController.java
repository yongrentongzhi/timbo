package com.demo.controller;

import com.demo.feign.DemoClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoClient demoClient;

    public DemoController(DemoClient demoClient) {
        this.demoClient = demoClient;
    }


    @GetMapping("/hello")
    public String hello() {

        return demoClient.hello();
    }
}
