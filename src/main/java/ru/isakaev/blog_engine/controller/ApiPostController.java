package ru.isakaev.blog_engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/post")
public class ApiPostController {

    @GetMapping
    public String showAllPost(@RequestParam Integer offset,
                              @RequestParam Integer limit,
                              @RequestParam String mode){
        Integer i = offset;
        Integer l = limit;
        String m = mode;

        System.out.println(i + l + m);

        return "String";
    }
}
