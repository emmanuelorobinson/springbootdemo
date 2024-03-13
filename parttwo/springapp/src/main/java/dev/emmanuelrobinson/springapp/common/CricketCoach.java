package dev.emmanuelrobinson.springapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {

    @Override
    public String getDailyWorkout() {
        return "Treadmill run for 30 minutes.";
    }
}
