package com.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/oauth")
public class OAuthController {

    @GetMapping("/google")
    public void authenticateGoogleUser(@RequestParam("code") String authCode){

    }

}
