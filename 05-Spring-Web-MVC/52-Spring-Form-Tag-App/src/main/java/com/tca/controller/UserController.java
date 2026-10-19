package com.tca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tca.module.User;

@Controller
public class UserController {

    @GetMapping("/form")
    public String getUserForm(Model model) {
        User user = new User();
        user.setEmail("example@gmail.com");
        user.setName("xyz abc");
        model.addAttribute("user", user);
        return "User";
    }

    @PostMapping("/register")
    public String showUserInfo(@ModelAttribute User user , Model model){
        model.addAttribute("name",user.getName());
        model.addAttribute("email",user.getEmail());
        model.addAttribute("mobile",user.getMobile());
        model.addAttribute("gender",user.getGender());

        return "UserDetail";
    }

}
