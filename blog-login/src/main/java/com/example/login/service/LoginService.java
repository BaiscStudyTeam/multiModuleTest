package com.example.login.service;

import com.example.login.dao.LoginDAO;
import com.example.login.entity.User;
import com.example.login.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginDAO loginDAO;

    private final UserRepository userRepository;

    public void callMe() {
        System.out.println("-----------------------------------------------");
        System.out.println("BOARD : Event Recieved From Core-Module");
        System.out.println(loginDAO.executeQuery());
        System.out.println("BOARD : EXECUTE DB Query");
        System.out.println("-----------------------------------------------");

    }

    public User insertLoginUser() {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().substring(0,30));
        user.setUserPassword("1234");
        user.setRegDt(new Timestamp(System.currentTimeMillis()));
        return userRepository.save(user);
    }
}

