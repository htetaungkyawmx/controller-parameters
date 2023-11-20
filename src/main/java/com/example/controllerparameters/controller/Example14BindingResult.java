package com.example.controllerparameters.controller;


import com.example.controllerparameters.ds.Address;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;


@Controller
public class Example14BindingResult {
    @GetMapping("/action01")
    public String action01(@ModelAttribute Address address){
        return "address-form";
    }

    public String action01Subnit(@ModelAttribute @Valid Address address, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "address-form";
        }
        redirectAttributes.addFlashAttribute(address);
        return "redirect:/action01/ok";
    }
    @GetMapping("/action01/ok")
    public String actionOK(@ModelAttribute Address address){
        return "address-form-ok";
    }

}
