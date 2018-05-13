package com.guwr.core.config;

import com.guwr.core.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {

    @Bean
    public User  user(){
        return new User();
    }

}
