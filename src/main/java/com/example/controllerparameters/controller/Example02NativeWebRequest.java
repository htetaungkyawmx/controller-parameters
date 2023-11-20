package com.example.controllerparameters.controller;

import org.apache.catalina.connector.RequestFacade;
import org.apache.catalina.connector.ResponseFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import java.io.IOException;

import static com.example.controllerparameters.util.JoinUtils.join;

public class Example02NativeWebRequest {
    //curl localhost:8080/actionB?name=John&country=US"
    @GetMapping("/actionB")
    @ResponseBody
    public void actionB(NativeWebRequest nativeWebRequest)throws IOException{
        RequestFacade requestFacade=nativeWebRequest.getNativeRequest(RequestFacade.class);
        ResponseFacade responseFacade=nativeWebRequest.getNativeResponse(ResponseFacade.class);

        responseFacade.getOutputStream().println(
                String.format(
                        "Retireved request with headers = [%s] , parameters = [%s]",
                        join(requestFacade.getHeaderNames()),
                        join(requestFacade.getParameterNames())
                )
        );

    }
}
