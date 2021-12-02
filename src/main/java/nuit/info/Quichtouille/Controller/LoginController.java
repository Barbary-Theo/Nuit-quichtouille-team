package nuit.info.Quichtouille.Controller;

import nuit.info.Quichtouille.model.User;
import nuit.info.Quichtouille.repositories.UserRepository;
import nuit.info.Quichtouille.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class LoginController {

    @Resource
    private UserService userService;

    @GetMapping
    public String getMappingPage(Model model){
        return "login";
    }

    @PostMapping("/addUser")
    @ResponseBody
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }


    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/geet")
    public void geet(){
        System.out.println("oui");
    }

}