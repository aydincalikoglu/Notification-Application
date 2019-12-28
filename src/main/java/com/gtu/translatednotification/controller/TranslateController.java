package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.model.dao.Translation;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class TranslateController extends BaseController {

    @RequestMapping(value = "translations", method = RequestMethod.GET)
    @ResponseBody
    public List<Translation> get(ModelMap map) {
        return translationService.get();
    }


    @RequestMapping(value = "translations", method = RequestMethod.POST)
    @ResponseBody
    public Optional<Translation> translate(@RequestBody Translation translation) {
        return translationService.translate(translation);
    }

}
