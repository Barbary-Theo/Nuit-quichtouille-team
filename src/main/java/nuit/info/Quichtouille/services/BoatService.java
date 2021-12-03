package nuit.info.quichtouille.services;


import nuit.info.quichtouille.model.Boat;
import nuit.info.quichtouille.model.User;

import java.util.List;

public interface BoatService {

    //Usual CRUD services
    public Boat findById(long id);
    public List<Boat> findAll();
    public Boat save(User user);
    public void delete(long id);

}
