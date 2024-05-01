package com.example.statistic_service.repository;

import com.example.statistic_service.entity.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepo extends JpaRepository<Statistic, Integer> {
}
