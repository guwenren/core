package com.guwr.core.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = "classpath:config.properties")
@Component
@ConfigurationProperties(prefix = "config")
@Getter
@Setter
public class Config {
    private Integer id;
    private String name;
}
