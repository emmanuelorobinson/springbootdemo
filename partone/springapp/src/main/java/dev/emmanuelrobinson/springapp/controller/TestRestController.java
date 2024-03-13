package dev.emmanuelrobinson.springapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Value("${test.name}")
    private String name;


    @Value("${test.team}")
    private String team;

    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run Barry run!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Name: " + name + ", Team: " + team;
    }
}
