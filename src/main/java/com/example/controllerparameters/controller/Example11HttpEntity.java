package com.example.controllerparameters.controller;

import com.example.controllerparameters.ds.Address;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example11HttpEntity {
    //curl -X POST -H 'Content-Type: application/json' -d '{"firstName":"John","lastName":"Doe","streetAddress":"455 Dr. Apt 23","city":"NewYork","stateCode":"CA","zipCode":"11111","country":"US"}' localhost:8080/actionK
    @PostMapping("/actionK")
    @RequestMapping
    public String actionK(HttpEntity<Address> httpEntity){
        return String.format(
                "Received request from host = [%s], \n Address =[%s]\n",
                httpEntity.getHeaders().getHost(),
                httpEntity.getBody()
        );
    }

}
