package com.example.controllerparameters.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example07HttpMethod {

    //curl -X GET localhost:8080/actionG
    //curl -X POST localhost:8080/actionG
    //curl -X PUT localhost:8080/actionG
    @RequestMapping("/actionG")
    @ResponseBody
    public String actionH(HttpMethod httpMethod){
        return String.format("Http Method =[%s]\n",httpMethod);
    }
}
