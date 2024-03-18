package dev.emmanuelrobinson.springapp.common;

public class SwimCoach implements ICoach {

    public SwimCoach() {
        System.out.println("SwimCoach: inside no-arg constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }
}
