package ru.isakaev.blog_engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/auth")
public class ApiAuthController {

    @GetMapping("/check")
    public String checkAuth(){
        String s = "Auth checked";
        return s;
    }
}
