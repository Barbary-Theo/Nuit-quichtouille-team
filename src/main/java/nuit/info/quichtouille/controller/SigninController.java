package nuit.info.quichtouille.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signin")
public class SigninController {


    @GetMapping
    public String getMappingPage(Model model){

        return "signin";
    }



}
