package com.example.account_service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

//	@Bean
//	NewTopic notification() {
//		return new NewTopic("notification", 2, (short) 1);
//	}
//
//	@Bean
//	NewTopic statistic() {
//		// topic name, partition numbers, replication number
//		return new NewTopic("statistic", 1, (short) 1);
//	}
}
