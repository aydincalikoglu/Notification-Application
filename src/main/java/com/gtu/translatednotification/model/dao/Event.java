package com.gtu.translatednotification.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(columnDefinition = "TEXT")
    String title;
    String type = "waiting";
    String backgroundColor = "white";
    LocalDate startDate = LocalDateTime.now().toLocalDate();
    LocalDate endDate = LocalDateTime.now().toLocalDate();
    Integer status = 0;
}
