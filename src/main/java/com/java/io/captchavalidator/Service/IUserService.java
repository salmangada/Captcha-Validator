package com.java.io.captchavalidator.Service;

import com.java.io.captchavalidator.Model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    void create(User user);

    List<User> getAllUser();

    Optional<User> getOneUser(Integer Id);
}
