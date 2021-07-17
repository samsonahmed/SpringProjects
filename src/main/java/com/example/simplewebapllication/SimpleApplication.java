package com.example.simplewebapllication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApplication {

@RequestMapping("/")
public String index(){
    return "Hello samson welcome to spring world";
}
}
