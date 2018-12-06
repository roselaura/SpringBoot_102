package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("name", "My name is Laura Rose." );
        model.addAttribute("age", "I'm 20 years old." );
        return "hometemplate";
    }
}

