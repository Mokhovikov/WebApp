package com.Spring.WebApp.Controllers;

import com.Spring.WebApp.Models.Post;
import com.Spring.WebApp.Models.User;
import com.Spring.WebApp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String userList( Model model){

        model.addAttribute("users", userRepository.findAll());
        return "userList";
    }
}
