package nuit.info.quichtouille.controller;

import nuit.info.quichtouille.model.User;
import nuit.info.quichtouille.repositories.UserRepository;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getMappingPage(Model model){
        return "index";
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll(Model model){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
