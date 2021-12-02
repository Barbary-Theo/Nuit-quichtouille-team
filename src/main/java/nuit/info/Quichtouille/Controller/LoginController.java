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

@Controller
@RequestMapping("/")
public class LoginController {

    @Resource
    private UserService userService;

    @PostMapping("/addUser")
    @ResponseBody
    public void addUser(@RequestBody User user){
        userService.save(user);
    }

}