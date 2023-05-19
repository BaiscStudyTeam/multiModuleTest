package com.example.multimodule;

import com.example.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.login.service.LoginService;

@RestController
public class MainCore {

    @Autowired
    public BoardService boardService;

    @Autowired
    public LoginService loginService;


    @GetMapping("/")
    public void mainCoreMethod() {

        // LOGIN으로 event를 보낸다.
        System.out.println("-----------------------------------------------");
        System.out.println("CORE : EVENT PUBLISH TO BLOG-LOGIN");
        System.out.println("-----------------------------------------------");

        boardService.callMe();

        // board로 event를 보낸다.
        System.out.println("-----------------------------------------------");
        System.out.println("CORE : EVENT PUBLISH TO BLOG-BOARD");
        System.out.println("-----------------------------------------------");

        loginService.callMe();

    }

}
