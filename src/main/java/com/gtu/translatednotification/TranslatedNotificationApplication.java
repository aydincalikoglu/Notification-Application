package com.gtu.translatednotification;

import com.gtu.translatednotification.model.dao.Mail;
import com.gtu.translatednotification.model.dao.Note;
import com.gtu.translatednotification.repository.MailRepo;
import com.gtu.translatednotification.repository.NoteRepo;
import com.gtu.translatednotification.service.Impl.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;

import java.sql.Date;

@SpringBootApplication
public class TranslatedNotificationApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TranslatedNotificationApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TranslatedNotificationApplication.class, args);
    }

}


@Component
@Slf4j
class TestCLRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {

    }
}


