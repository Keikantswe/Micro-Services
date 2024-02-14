package com.keikantswe.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        return "Department Service is currently down";
    }


    @GetMapping("/employeeServiceFallback")
    public String employeeServiceFallback(){
        return "Employee Service is currently down";
    }
}
