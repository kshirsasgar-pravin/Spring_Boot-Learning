package com.tca.controller;

import com.tca.model.User;
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
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user",user);

        return "User";
    }

    @PostMapping("/register")
    public String handleForm(@Valid @ModelAttribute User user,
                             BindingResult bindingResult,
                             Model model){

        if(bindingResult.hasErrors()){
            return "User";
        }

        model.addAttribute("username",user.getUsername());
        model.addAttribute("email",user.getEmail());
        model.addAttribute("mobile",user.getMobile());
        model.addAttribute("gender" ,user.getGender());
        model.addAttribute("birthDate",user.getBirthDate());

        return "UserDetails";
    }

}
