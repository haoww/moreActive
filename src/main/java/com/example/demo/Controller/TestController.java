package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String prot;
    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/")
    public String get() {
        return name + "的端口" + prot;
    }
}
