package com.gtu.translatednotification.service;

import com.gtu.translatednotification.model.dao.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getActive(Optional<String> maybeCountryCode);

    Long save(User user);

    void deleteById(Long id);
}
