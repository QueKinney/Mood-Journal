package com.example.moodjournal.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

    public String index(){
        return "Welcome to Mood Journal";
    }
}
