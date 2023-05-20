package com.example.multimodule.controller;

import com.example.login.service.LoginService;
import io.sentry.Sentry;
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

    // PULLREQUEST용 주석 추가
    @GetMapping("/testSentry")
    public ResponseEntity<Object> testSentry() {
        Sentry.init(options -> {
            options.setDsn("https://aca63734d7b844709390e4b636d2a967@o4505215665897472.ingest.sentry.io/4505215667011584");
        });
        try {
            throw new Exception("SPRING BOOT : Throw Test Exception");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return ResponseEntity.ok().body(null);
    }
}
