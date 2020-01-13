package com.gtu.translatednotification.service;

import com.gtu.translatednotification.model.dao.Event;

import java.util.List;

public interface IEventService {
    List<Event> get(String type);
    Long save(Event event);
    void deleteById(Long id);
}
