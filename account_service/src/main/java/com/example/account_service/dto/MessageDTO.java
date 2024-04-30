package com.example.account_service.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
//@Entity
public class MessageDTO {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;

//    @Column(name = "to_email")
    private String to;

    private String toName;
    private String subject;
    private String content;

    private boolean status;
}
