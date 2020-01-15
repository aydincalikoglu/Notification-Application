package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.model.dao.Mail;
import com.gtu.translatednotification.model.dao.Translation;
import com.gtu.translatednotification.model.enums.MailType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Comparator;
import java.util.List;
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

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String users(ModelMap map,
                        @RequestParam(value = "countryCode", required = false) String code) {
        map.addAttribute("users", userService.getActive(Optional.ofNullable(code)));
        return "users";
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
                        @RequestParam(value = "subject", required = false) String subject,
                        @RequestParam(value = "body", required = false) String body,
                        @RequestParam(value = "id", required = false) Long maybeId) {
        map.addAttribute("subject", subject);
        map.addAttribute("body", body);

        Optional.ofNullable(maybeId).ifPresent(id -> {
            Mail mail = mailService.getById(id);
            map.addAttribute("subject", mail.getSubject());
            map.addAttribute("body", mail.getBody());
            map.addAttribute("mail", mail);
        });
        map.addAttribute("translationLanguages", translationService.getSupportedLanguages());

        return "mailbox/email";
    }

    @RequestMapping(value = "/email", method = RequestMethod.POST)
    @ResponseBody
    public Boolean sendEmail(@ModelAttribute("mail") Mail mail,
                             @RequestParam(value = "to") String toType,
                             @RequestParam(value = "countryCode", required = false) String countryCode,
                             @RequestParam(value = "attachment", required = false) MultipartFile attachment) {
        if (mail.getCategory() != null && mail.getCategory().trim().isEmpty()) {
            mail.setCategory(null);
        }
        if (MailType.SENT.getType().equals(mail.getType())) {
            mail.setId(null); // To create new mail
            if ("one".equals(toType)) {
                return mailService.send(mail, Stream.of(attachment).collect(Collectors.toList()));
            } else {
                userService.getActive(Optional.ofNullable(countryCode)).forEach(user -> {
                    mail.setMailAddress(user.getMail());
                    mailService.send(mail, Stream.of(attachment).collect(Collectors.toList()));
                });
                return true;
            }
        } else {
            // Upsert a mail draft
            return mailService.save(mail).getId() != null;
        }
    }

    @RequestMapping(value = "/mailbox", method = RequestMethod.GET)
    public String inbox(ModelMap map,
                        @RequestParam(value = "type", defaultValue = "inbox") String type) {
        map.addAttribute("mails", mailService.get(type).stream()
            .sorted(Comparator.comparing(Mail::getId).reversed()).collect(Collectors.toList()));

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
        List<Mail> drafts = mailService.get("draft");
        map.addAttribute("drafts", drafts);
        map.addAttribute("draftCategories", drafts.stream().filter(t -> t.getCategory() != null).collect(Collectors.groupingBy(Mail::getCategory)).keySet().toArray());
        return "drafts";
    }

    @RequestMapping(value = "/drafts/{id}", method = RequestMethod.GET)
    public String deleteMail(ModelMap map,
                             @PathVariable("id") Long id) {
        mailService.deleteById(id);
        return readMail(map);
    }

}
