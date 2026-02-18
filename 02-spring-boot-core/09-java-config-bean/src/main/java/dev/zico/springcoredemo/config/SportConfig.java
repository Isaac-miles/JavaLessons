package dev.zico.springcoredemo.config;

import dev.zico.springcoredemo.common.Coach;
import dev.zico.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
