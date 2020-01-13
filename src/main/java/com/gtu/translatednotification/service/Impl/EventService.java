package com.gtu.translatednotification.service.Impl;

import com.gtu.translatednotification.model.dao.Event;
import com.gtu.translatednotification.repository.EventRepo;
import com.gtu.translatednotification.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService {

    @Autowired
    EventRepo eventRepo;

    @Override
    public List<Event> get(String type) {
        return eventRepo.findAll(EventRepo.typeFilter(type).and(EventRepo.statusFilter(1L)));
    }

    @Override
    public Long save(Event event) {
        event.setStartDate(event.getStartDate().plusDays(1)); // because of bug
        event.setEndDate(event.getEndDate().plusDays(1)); // because of bug
        return eventRepo.save(event).getId();
    }

    @Override
    public void deleteById(Long id) {
        eventRepo.deleteById(id);
    }
}
