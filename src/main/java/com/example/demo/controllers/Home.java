package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home 
{
    @GetMapping("/")   
    public String home(Model model) 
    {
        return "home";
    }
}
