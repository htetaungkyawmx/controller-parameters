package com.example.controllerparameters.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
public class Example13RedirectAttributes {

    @GetMapping("/actionN1")
    public String actionM1(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("firstName","John");
        redirectAttributes.addFlashAttribute("lastName","Doe");
        redirectAttributes.addFlashAttribute("city","London");
        return "redirect:/actionN2";
    }
    @GetMapping("/actionN2")
    public String actionM2(@RequestParam(value = "firstName",required = false)String firstName, @ModelAttribute("lastName")String lastName
        ,@ModelAttribute("city")String city, Model model
    ){
    model.addAttribute("firstName",firstName);
    return "list-attributes";
    }

}
