package com.api.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ApiController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World Rest Api. The current time is "+ new Date();
    }
}
