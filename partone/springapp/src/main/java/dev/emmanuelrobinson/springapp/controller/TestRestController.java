package dev.emmanuelrobinson.springapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }
}
