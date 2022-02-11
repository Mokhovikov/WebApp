package com.Spring.WebApp.Controllers;

import com.Spring.WebApp.Models.User;
import com.Spring.WebApp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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

    @GetMapping("/useredit/{id}")
    public String blogEdit(@PathVariable(value = "id") long id, Model model){

        Optional<User> user = userRepository.findById(id);
        ArrayList<User> res = new ArrayList<>();
        user.ifPresent(res::add);
        model.addAttribute("user", res);


        return "useredit";
    }

    @PostMapping("/useredit/{id}")
    public String blogPostUpdate(@PathVariable(value = "id") long id, @RequestParam String username, Model model){
        User user = userRepository.findById(id).orElseThrow();
        user.setUsername(username);

        userRepository.save(user);

        return "redirect:/user";
    }




}
