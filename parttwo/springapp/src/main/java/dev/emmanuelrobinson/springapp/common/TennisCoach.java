package dev.emmanuelrobinson.springapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }
}
