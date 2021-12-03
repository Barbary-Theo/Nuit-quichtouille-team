package nuit.info.quichtouille.controller;

import net.bytebuddy.implementation.bytecode.Throw;
import nuit.info.quichtouille.model.User;
import nuit.info.quichtouille.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getMappingPage(Model model){
        return "login";
    }

    @PostMapping("/addUser")
    @ResponseBody
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll(){
        System.out.println("test");
        userRepository.findAll().forEach(user -> {
            System.out.println(user.getPrenom());
        });


        return ResponseEntity.ok(userRepository.findAll());

    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") long id) throws Exception {

        User user = userRepository.findById(id).orElseThrow(() ->  new Exception("AIE"));
        return ResponseEntity.ok(user);
    }

    @GetMapping("/geet")
    public void geet(){
        System.out.println("oui");
    }

}
