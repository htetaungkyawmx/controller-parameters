package com.example.controllerparameters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import static com.example.controllerparameters.util.JoinUtils.join;

@Controller
public class Example01WebRequest {
    //curl localhost:8080/actionA?name=Kyaw&country=Myanmar"
    @GetMapping("/actionA")
    @ResponseBody
    public String actionA(WebRequest webRequest){
        return String.format(
                "Retrieved request with headers = [%s], parameters = [%s]\n",
                join(webRequest.getParameterNames()),
                join(webRequest.getParameterNames())
        );
    }
}