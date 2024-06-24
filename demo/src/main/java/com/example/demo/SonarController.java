package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SonarController {
    @GetMapping("/")
    public String message(){
        return "hi";

    }
}
