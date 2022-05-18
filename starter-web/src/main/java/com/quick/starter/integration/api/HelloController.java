package com.quick.starter.integration.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/say-hello")
    public String sayHello() {
        return "Greetings from Spring Boot!";
    }

}
