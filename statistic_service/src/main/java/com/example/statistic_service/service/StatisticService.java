package com.example.statistic_service.service;

import com.example.statistic_service.entity.Statistic;
import com.example.statistic_service.repository.StatisticRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StatisticRepo statisticRepo;

    @KafkaListener(id = "statisticGroup", topics = "statistic")
    public void listen(Statistic statistic) {
        logger.info("Received: " + statistic.getMessage());
        statisticRepo.save(statistic);
    }
}
