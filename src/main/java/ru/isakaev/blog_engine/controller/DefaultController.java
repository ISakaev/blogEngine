package ru.isakaev.blog_engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    /**
     * Получить шаблон главной страницы
     */
    @GetMapping("/")
    public String showAllPersons () {
        return "templates/index";
    }
}
