package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.model.dao.Mail;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class MailController extends BaseController {

    @RequestMapping(value = "/emails", method = RequestMethod.GET)
    @ResponseBody
    public List<Mail> get(ModelMap map) {
        return mailService.get();
    }

    @RequestMapping(value = "/emails", method = RequestMethod.POST)
    @ResponseBody
    public Boolean sendEmail(@RequestBody Mail mail) {
        return mailService.send(mail);
    }
}
