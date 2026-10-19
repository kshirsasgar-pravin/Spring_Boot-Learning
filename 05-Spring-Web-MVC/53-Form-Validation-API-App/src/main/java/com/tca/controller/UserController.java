package com.tca.controller;

import com.tca.module.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/form")
    public String showUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "User";
    }

    @PostMapping("/register")
    public String showUserInfo(
            @Valid
            @ModelAttribute User user ,
            BindingResult result,
            Model model){

        if(result.hasErrors()){
            return "User";
        }

        model.addAttribute("name",user.getName());
        model.addAttribute("email",user.getEmail());
        model.addAttribute("mobile",user.getMobile());
        model.addAttribute("birthDate", user.getBirthDate());
        model.addAttribute("gender",user.getGender());

        return "UserDetails";
    }
}
