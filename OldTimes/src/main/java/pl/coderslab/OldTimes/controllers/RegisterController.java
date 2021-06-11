package pl.coderslab.OldTimes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.OldTimes.entity.User;
import pl.coderslab.OldTimes.service.UserService;

import javax.validation.Valid;


@Controller
public class RegisterController {

    private UserService userService;
    public
    RegisterController(UserService theUserService) {
        userService = theUserService;
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);


        return "register-form";
    }
    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") @Valid  User user,
        BindingResult result) {
            System.out.println(user);

            if (result.hasErrors()) {

                return "register-form";
            } else {
                userService.save(user);

                return "register-confirm";
            }
        }
    }

