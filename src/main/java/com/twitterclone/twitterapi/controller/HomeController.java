package com.twitterclone.twitterapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
        public String health(){
            return "TwitterCloneAPI is up!";
        }
    }
