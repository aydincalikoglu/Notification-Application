package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.service.IEventService;
import com.gtu.translatednotification.service.IMailService;
import com.gtu.translatednotification.service.ITranslationService;
import com.gtu.translatednotification.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;

import java.io.Serializable;

abstract class BaseController implements Serializable {

    @Autowired
    TemplateEngine templateEngine;

    @Autowired
    IMailService mailService;

    @Autowired
    ITranslationService translationService;

    @Autowired
    IEventService eventService;

    @Autowired
    IUserService userService;

}
