package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.model.dao.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class PageController extends BaseController {

    @RequestMapping("/")
    public String dashboard(ModelMap map) throws IOException {
        map.addAttribute("title", "translation App");
        map.addAttribute("translations", translationService.getSupportedLanguages());
        return "index";
    }

    @RequestMapping(value = "/translate", method = RequestMethod.GET)
    public String translate() {
        return "translate";
    }

    @RequestMapping(value = "/email", method = RequestMethod.GET)
    public String emails(ModelMap map) {
        return "mailbox/email";
    }

    @RequestMapping(value = "/mailbox", method = RequestMethod.GET)
    public String inbox(ModelMap map,
                        @RequestParam(value = "type",defaultValue = "inbox") String type) {
        map.addAttribute("mails", mailService.get(type));

        return "mailbox/inbox";
    }


    @RequestMapping(value = "/mailbox/1", method = RequestMethod.GET)
    public String readMail(ModelMap map) {
        return "mailbox/read-mail";
    }


    @RequestMapping(value = "/email", method = RequestMethod.POST)
    @ResponseBody
    public Boolean sendEmail(@ModelAttribute("mail") Mail mail,
                             @RequestParam(value = "attachment", required = false) MultipartFile attachment) {
        return mailService.send(mail, Stream.of(attachment).collect(Collectors.toList()));
    }
}
