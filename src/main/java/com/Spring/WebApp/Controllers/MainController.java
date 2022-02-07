package com.Spring.WebApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }



    @GetMapping("/privatePage")
    public String prPage(Model model){
        model.addAttribute("title", "Личная страница");
        return "privatePage";
    }





}