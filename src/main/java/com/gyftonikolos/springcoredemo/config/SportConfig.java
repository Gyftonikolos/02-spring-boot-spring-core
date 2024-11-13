package com.gyftonikolos.springcoredemo.config;

import com.gyftonikolos.springcoredemo.common.Coach;
import com.gyftonikolos.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
