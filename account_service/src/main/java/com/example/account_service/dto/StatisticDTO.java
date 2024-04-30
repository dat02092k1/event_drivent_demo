package com.example.account_service.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatisticDTO {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;

    private String message;

    private Date createdDate;

//    private boolean status;
}
