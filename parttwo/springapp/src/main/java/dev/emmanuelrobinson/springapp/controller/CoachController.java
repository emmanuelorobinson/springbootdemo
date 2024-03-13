package dev.emmanuelrobinson.springapp.controller;

import dev.emmanuelrobinson.springapp.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
public class CoachController {
    private ICoach coach;

    @Autowired
    public CoachController(ICoach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout/daily")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
