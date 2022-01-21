package ru.isakaev.blog_engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class ApiGeneralController {

    @GetMapping("/init")
    public String getInit(){
        String s = "Get init";
        return s;
    }

    @GetMapping("/settings")
    public String showAllSettings(){
        String s = "All settings";
        return s;
    }

    @GetMapping("/tag")
    public String showAllTags(@RequestParam String query){
        String s = "All tags";
        return s;
    }
}
