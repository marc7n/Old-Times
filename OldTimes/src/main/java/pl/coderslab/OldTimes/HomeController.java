package pl.coderslab.OldTimes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String welcomeForm(){
return "home";
    }

    @RequestMapping("welcomeFormPrint")
    public String welcomeFormPrint(){
        return "home-print";
    }
}
