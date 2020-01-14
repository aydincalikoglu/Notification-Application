package com.gtu.translatednotification.service.Impl;

import com.gtu.translatednotification.model.dao.User;
import com.gtu.translatednotification.repository.UserRepo;
import com.gtu.translatednotification.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getActive(Optional<String> maybeCountryCode) {
        return maybeCountryCode.map(countryCode -> userRepo.findAll(UserRepo.countryCodeFilter(countryCode).and(UserRepo.statusFilter(1L))))
            .orElseGet(() -> userRepo.findAll(UserRepo.statusFilter(1L)));
    }

    @Override
    public Long save(User user) {
        return userRepo.save(user).getId();
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
