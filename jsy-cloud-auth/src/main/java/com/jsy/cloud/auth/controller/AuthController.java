package com.jsy.cloud.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    /**
     * 1）response_type=code
     * 2) response_type=code & pkce
     * 3) response_type=token
     */
    @GetMapping("/authorize")
    public String authorize() {

        return "";
    }

    /**
     * 1) grant_type=authorization_code
     * 2) grant_type=password
     * 3) grant_type=client_crendentials
     */
    @PostMapping("/token")
    public void token() {
    }
}
