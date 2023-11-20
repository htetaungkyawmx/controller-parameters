package com.example.controllerparameters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Controller
public class Example04ServletRequestAndResponse {

    //curl localhost:8080/actionD
    @GetMapping("/actionD")
    @ResponseBody
    public void actionD(ServletRequest servletRequest, ServletResponse servletResponse)throws IOException{
        servletResponse.getOutputStream().println(
                String.format("Retrieved request on server =[%s:%d]", servletRequest.getServerName()
                ,servletRequest.getServerPort())
        );
    }
}
