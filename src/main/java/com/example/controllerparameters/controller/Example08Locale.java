package com.example.controllerparameters.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
public class Example08Locale {
    //curl -H "Accept-Language: en" localhost:8080/actionH
    //curl -H "Accept-Language: es" localhost:8080/actionH
    //curl -H "Accept-Language: pl" localhost:8080/actionH
    @RequestMapping("/actionH")
    @ResponseBody
    public String actionH(Locale locale){
        return String.format("Locale = [%s]\n",locale.getDisplayName());
    }
}
