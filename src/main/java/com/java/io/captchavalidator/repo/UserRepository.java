package com.java.io.captchavalidator.repo;

import com.java.io.captchavalidator.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
