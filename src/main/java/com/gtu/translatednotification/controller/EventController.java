package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.model.dao.Event;
import com.gtu.translatednotification.model.dao.Translation;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class EventController extends BaseController {


    @RequestMapping(value = "/events", method = RequestMethod.POST)
    @ResponseBody
    public Long saveEvent(@RequestBody Event event) {
        return eventService.save(event);
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Long removeEvent(@PathVariable Long id) {
        eventService.deleteById(id);
        return id;
    }

}
