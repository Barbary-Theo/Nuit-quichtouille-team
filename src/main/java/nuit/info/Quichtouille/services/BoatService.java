package nuit.info.Quichtouille.services;

import nuit.info.Quichtouille.model.Boat;
import nuit.info.Quichtouille.model.User;

import java.util.List;

public interface BoatService {

    //Usual CRUD services
    public Boat findById(long id);
    public List<Boat> findAll();
    public Boat save(User user);
    public void delete(long id);

}
