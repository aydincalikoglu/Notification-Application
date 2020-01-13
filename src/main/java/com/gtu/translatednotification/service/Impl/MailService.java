package com.gtu.translatednotification.service.Impl;

import com.gtu.translatednotification.model.dao.Mail;
import com.gtu.translatednotification.repository.MailRepo;
import com.gtu.translatednotification.service.IMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.internet.MimeMessage;
import java.util.Collection;
import java.util.List;

@Service
@Component
@Slf4j
public class MailService implements IMailService {

    @Autowired
    MailRepo mailRepo;

    @Autowired
    private JavaMailSender javaMailSender;

    public Mail getById(Long id) {
        return mailRepo.getOne(id);
    }

    @Override
    public List<Mail> get() {
        return mailRepo.findAll();
    }

    @Override
    public List<Mail> get(String type) {
        return mailRepo.findAll(MailRepo.typeFilter(type));
    }

    @Override
    public Boolean send(Mail mail) {
        return send(mail, null);
    }

    @Override
    public Boolean send(Mail mail, Collection<MultipartFile> files) {
        Boolean isSent = send(mail.getMailAddress(), mail.getSubject(), mail.getBody(), files);
        mailRepo.save(mail);
        return isSent;
    }

    @Override
    public Boolean send(String to, String subject, String body) {
        return send(to, subject, body, null);
    }

    @Override
    public Boolean send(String to, String subject, String body, Collection<MultipartFile> files) {
        MimeMessage msg = javaMailSender.createMimeMessage();
        boolean hasfile = files != null && files.size() > 0;
        try {
            MimeMessageHelper miniMsg = new MimeMessageHelper(msg, hasfile);
            miniMsg.setTo(to.split(","));
            miniMsg.setSubject(subject);
            ;
            miniMsg.setText(body, body.contains("<"));
            if (hasfile) {
                for (MultipartFile file : files) {
                    if (file.getOriginalFilename() != null && file.getOriginalFilename().contains(".")) { // must have fileName extension
                        miniMsg.addAttachment(file.getOriginalFilename(), file);
                    }
                }
            }
            javaMailSender.send(msg);
        } catch (Exception e) {
            log.error(subject + " Mail has not been sent.", e);
            return false;
        }
        log.info(subject + " Mail has been sent ");
        return true;
    }

    /*
    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("my.gmail@gmail.com");
        mailSender.setPassword("password");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }


    public void sendEmail() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("aycalikoglu@gmail.com");
        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");
        javaMailSender.send(msg);
    }

    public void sendEmailWithAttachment() throws MessagingException {
        System.out.println(javaMailSender==null);
        MimeMessage msg = javaMailSender.createMimeMessage();
        // true = multipart message
        MimeMessageHelper miniMsg = new MimeMessageHelper(msg, true);
        miniMsg.setTo("aycalikoglu@gmail.com");
        miniMsg.setSubject("Testing from Spring Boot");
        // default = text/plain
        //helper.setText("Check attachment for image!");
        // true = text/html
        miniMsg.setText("<h1>Check attachment for image!</h1>", true);
        miniMsg.addAttachment("my_photo.png", new ClassPathResource("images/android.png"));
        javaMailSender.send(msg);
    }



    public void sendMail(String from, String to, String subject, String body) {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo(to);
        mail.setSubject(subject);
        mail.setText(body);

        logger.info("Sending...");

        javaMailSender.send(mail);

        logger.info("Done!");
    }

    */
}
