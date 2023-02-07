package com.inflow.annotation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m")
public class MyController {

    @GetMapping("/home")
    public String msg(){

        return "hi from controller";
    }

}
