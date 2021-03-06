package com.gtu.translatednotification.service;

import com.gtu.translatednotification.model.dao.Mail;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.List;

public interface IMailService {
    Mail getById(Long id);
    List<Mail> get();
    List<Mail> get(String type);
    Mail save(Mail mail);
    void deleteById(Long id);
    Boolean send(Mail mail);
    Boolean send(Mail mail, Collection<MultipartFile> files);
    Boolean send(String to, String subject, String body);
    Boolean send(String to, String subject, String body, Collection<MultipartFile> files);
}
