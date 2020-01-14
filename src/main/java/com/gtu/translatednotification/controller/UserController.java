package com.gtu.translatednotification.controller;

import com.gtu.translatednotification.model.dao.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class UserController extends BaseController {


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> get(@RequestParam(value = "countryCode", required = false) String code ) {
        return userService.getActive(Optional.ofNullable(code));
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public Long save(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Long deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return id;
    }

}
