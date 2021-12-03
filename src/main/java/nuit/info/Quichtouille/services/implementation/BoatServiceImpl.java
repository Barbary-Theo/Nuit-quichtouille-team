package nuit.info.Quichtouille.services.implementation;

import nuit.info.Quichtouille.model.Boat;
import nuit.info.Quichtouille.model.User;
import nuit.info.Quichtouille.repositories.BoatRepository;
import nuit.info.Quichtouille.repositories.UserRepository;
import nuit.info.Quichtouille.services.BoatService;

import javax.annotation.Resource;
import java.util.List;

public class BoatServiceImpl implements BoatService {

    @Resource
    private BoatRepository boatRepository;

    //Repository Getters / Setters
    public BoatRepository getBoatRepository() {
        return boatRepository;
    }

    public void setBoatRepository(BoatRepository boatRepository) {
        this.boatRepository = boatRepository;
    }


    @Override
    public Boat findById(long id) {
        return null;
    }

    @Override
    public List<Boat> findAll() {
        return null;
    }

    @Override
    public Boat save(User user) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
