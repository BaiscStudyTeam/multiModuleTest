package com.example.login.service;

import com.example.login.dao.LoginDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginDAO loginDAO;
    @Autowired
    public LoginService(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    public void callMe() {
        System.out.println("-----------------------------------------------");
        System.out.println("BOARD : Event Recieved From Core-Module");
        System.out.println(loginDAO.executeQuery());
        System.out.println("BOARD : EXECUTE DB Query");
        System.out.println("-----------------------------------------------");

    }
}
