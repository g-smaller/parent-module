package com.keng.boot.learning.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/japi/health")
    public String health() {
        return "ok";
    }

}
