package com.org.apigateway.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * created with love by mundiaem
 * created on 03/08/2021
 * Time: 13:10
 * ⚡  - API-Gateway
 */
@RestController
public class FallBackController {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User service taking longer than expected please try again latter";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentFallBackMethod() {
        return "Department service taking longer than expected please try again latter";
    }

    @HystrixCommand(fallbackMethod = "defaultStores")
    public String getStores(Map<String, Object> parameters) {
        //do stuff that might fail
        return "";
    }

    public String defaultStores(Map<String, Object> parameters) {
        return "Object";
    }
}
