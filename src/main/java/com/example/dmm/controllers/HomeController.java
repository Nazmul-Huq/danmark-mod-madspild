package com.example.dmm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

   @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index")
    public String index() {
       return "index";
    }

    @GetMapping("/restaurant")
    public String restaurant() {
       return "restaurant";
    }

    @GetMapping("/communal")
    public String communal() {
       return "communal";
    }

    @GetMapping("/whoweare")
    public String whoWeAre() {
        return "whoweare";
    }
}
