package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.model.dao.Event;
import com.gtu.translatednotification.model.dao.Mail;
import com.gtu.translatednotification.model.dao.Translation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class PageController extends BaseController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String dashboard(ModelMap map) {
        map.addAttribute("title", "translation App");
        map.addAttribute("translationLanguages", translationService.getSupportedLanguages());
        map.addAttribute("waitingEvents", eventService.get("waiting"));
        map.addAttribute("completeEvents", eventService.get("completed"));
        return "calendar";
    }

    @RequestMapping(value = "/translate", method = RequestMethod.GET)
    public String translate(ModelMap map) {
        map.addAttribute("translationLanguages", translationService.getSupportedLanguages());
        return "translate";
    }

    @RequestMapping(value = "/translate", method = RequestMethod.POST)
    @ResponseBody
    public Stream<Translation> saveTranslate(@ModelAttribute("translate") Translation translation,
                                             @RequestParam(value = "header") String header,
                                             @RequestParam(value = "body") String body) {
        translation.setSource(header);
        Optional<Translation> headerTranslate = translationService.translate(translation);
        translation.setSource(body);
        Optional<Translation> bodyTranslate = translationService.translate(translation);
        return Stream.of(headerTranslate, bodyTranslate).filter(Optional::isPresent).map(Optional::get);
    }

    @RequestMapping(value = "/email", method = RequestMethod.GET)
    public String email(ModelMap map,
                        @RequestParam(value = "header", required = false) String header,
                        @RequestParam(value = "body", required = false) String body) {
        map.addAttribute("header", header);
        map.addAttribute("body", body);
        return "mailbox/email";
    }

    @RequestMapping(value = "/email", method = RequestMethod.POST)
    @ResponseBody
    public Boolean sendEmail(@ModelAttribute("mail") Mail mail,
                             @RequestParam(value = "attachment", required = false) MultipartFile attachment) {
        return mailService.send(mail, Stream.of(attachment).collect(Collectors.toList()));
    }

    @RequestMapping(value = "/mailbox", method = RequestMethod.GET)
    public String inbox(ModelMap map,
                        @RequestParam(value = "type", defaultValue = "inbox") String type) {
        map.addAttribute("mails", mailService.get(type));

        return "mailbox/inbox";
    }

    @RequestMapping(value = "/mailbox/{id}", method = RequestMethod.GET)
    public String readMail(ModelMap map,
                           @PathVariable("id") Long id) {
        map.addAttribute("mail", mailService.getById(id));
        return "mailbox/read-mail";
    }


    @RequestMapping(value = "/drafts", method = RequestMethod.GET)
    public String readMail(ModelMap map) {
        map.addAttribute("mails", mailService.get("drafts"));
        return "drafts";
    }

}
