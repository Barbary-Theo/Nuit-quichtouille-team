package nuit.info.quichtouille.controller;

import nuit.info.quichtouille.model.Boat;
import nuit.info.quichtouille.repositories.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/boat")
public class BoatController {

    @Autowired
    private BoatRepository boatRepository;

    @PostMapping("/addBoat")
    @ResponseBody
    public Boat addBoat(@RequestBody Boat boat){
        return boatRepository.save(boat);
    }

}
