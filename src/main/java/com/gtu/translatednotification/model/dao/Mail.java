package com.gtu.translatednotification.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String mailAddress;
    @NotBlank
    String subject;
    @Column(columnDefinition = "TEXT")
    String body;
    String type = "sent";
    LocalDate iDate = LocalDateTime.now().toLocalDate();
    LocalDate uDate = LocalDateTime.now().toLocalDate();
    String category;
}
