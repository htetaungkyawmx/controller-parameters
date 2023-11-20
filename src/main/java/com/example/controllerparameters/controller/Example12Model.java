package com.example.controllerparameters.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Example12Model {

    @GetMapping("actionM1")
    public String actionM1(Map<String,String> model){
        model.put("firstName","John");
        model.put("lastName","Doe");
        model.put("email","john@mail.com");
        model.put("city","London");
        return "address";

    }
}
