package com.tca.controller;

import com.tca.module.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/form")
    public String showForm(){
        return "User";
    }

    @PostMapping("/register")
    public String userDetails(@ModelAttribute("user") User u , Model model){ 

        model.addAttribute("a",u.getName());
        model.addAttribute("b",u.getEmail());
        model.addAttribute("c",u.getAge());
        return "UserDetails";
    }

}
