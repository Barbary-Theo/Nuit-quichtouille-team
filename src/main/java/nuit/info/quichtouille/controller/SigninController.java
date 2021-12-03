package nuit.info.quichtouille.controller;

import nuit.info.quichtouille.model.User;
import nuit.info.quichtouille.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/signin")
public class SigninController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getMappingPage(Model model){

        return "signin";
    }

    @PostMapping("/insert")
    @ResponseBody
    public ResponseEntity<User> insert(@RequestBody User user) {

        return ResponseEntity.ok(userRepository.save(user));
    }



}
