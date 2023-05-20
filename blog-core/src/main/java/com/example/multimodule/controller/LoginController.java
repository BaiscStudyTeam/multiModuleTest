package com.example.multimodule.controller;

import com.example.login.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    // PULLREQUEST용 주석 추가
    @GetMapping("/insertUser")
    public ResponseEntity<Object> insertUser() {
        loginService.insertLoginUser();
        return ResponseEntity.ok().body("SUCCESS");
    }
}
