package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public ResponseEntity<String> HomeController(){
        return new ResponseEntity<>("Welcome to food delivery project", HttpStatus.OK);
    }
}
