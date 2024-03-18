package dev.emmanuelrobinson.springapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements ICoach {

    @Override
    public String getDailyWorkout() {
        return "Treadmill run for 30 minutes.";
    }

    @PostConstruct
    public void startUpCricket() {
        System.out.println("CricketCoach: inside post-construct method startUpCricket " + getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanUpCricket() {
        System.out.println("CricketCoach: inside pre-destroy method cleanUpCricket " + getClass().getSimpleName());
    }
}
