package com.example.notification_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@Configuration
public class MsgConfig {
    @Bean
    JsonMessageConverter converter() {
        return new JsonMessageConverter();
    }
}
