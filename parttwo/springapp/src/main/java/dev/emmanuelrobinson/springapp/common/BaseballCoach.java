package dev.emmanuelrobinson.springapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }
}
