package dev.emmanuelrobinson.springapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }
}
