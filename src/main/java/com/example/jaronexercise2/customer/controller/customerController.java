package com.example.jaronexercise2.customer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerController {

    @GetMapping
    public String frontpage(){
        return "space";
    }

}
