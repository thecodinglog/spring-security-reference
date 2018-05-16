package cothe.springsecurityreference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/login")
    public void login() {
    }

    @GetMapping("/home")
    public void home(){
    }
}
