package roman.kononenko.busterminal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLPagesController {

    @RequestMapping("/stopService")
    public String stopService(){
        return "index.html";
    }

    @RequestMapping("/")
    public String homePage(){
        return "authorization.html";
    }
}
