package pl.coderslab.OldTimes.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.OldTimes.entity.User;

import javax.validation.Valid;


@Controller
public class RegisterController {
    @GetMapping("/register")
    public String registerForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);


        return "register-form";
    }
    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("user")  User user,
        BindingResult result) {
            System.out.println(user);

            if (result.hasErrors()) {

                return "register-form";
            } else {
                return "register-confirm";
            }
        }
    }

