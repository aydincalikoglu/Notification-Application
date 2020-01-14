package com.gtu.translatednotification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;

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


