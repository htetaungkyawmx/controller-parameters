package com.example.controllerparameters.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;


@Controller
public class Example06Principal {
    @GetMapping("actionF")
    @ResponseBody
    public String actionF(Principal principal){

        return String.format("Authenticated with principal = [%s]\n",principal.getName());
    }

}
