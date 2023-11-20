package com.example.controllerparameters.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
public class Example10Streams {
    //curl -X POST -H "Content-Type: application/octet-stream" -d "{ request body content}" localhost:8080/actionJ
    @RequestMapping("/actionJ")
    @ResponseBody
    public void actionJ(InputStream inputStream, OutputStream outputStream)throws IOException{
        inputStream.transferTo(outputStream);
        outputStream.write(10);
    }
}
