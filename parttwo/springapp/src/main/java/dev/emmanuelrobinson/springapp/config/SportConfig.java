package dev.emmanuelrobinson.springapp.config;

import dev.emmanuelrobinson.springapp.common.ICoach;
import dev.emmanuelrobinson.springapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public ICoach swimCoach() {
        return new SwimCoach();
    }
}
