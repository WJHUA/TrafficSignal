package com.jupiter.ts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/intersections")
    public String intersections(){
        return "/intersections";
    }
}
