package com.example.account_service.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTopic {
    @Bean
    NewTopic notification() {
        return new NewTopic("notification", 2, (short) 1);
    }

    @Bean
    NewTopic statistic() {
        // topic name, partition numbers, replication number
        return new NewTopic("statistic", 1, (short) 1);
    }
}
