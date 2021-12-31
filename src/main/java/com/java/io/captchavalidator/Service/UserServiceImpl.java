package com.java.io.captchavalidator.Service;

import com.java.io.captchavalidator.Model.User;
import com.java.io.captchavalidator.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getOneUser(Integer Id) {
        return userRepository.findById(Id);
    }
}
