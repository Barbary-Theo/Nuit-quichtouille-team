package nuit.info.quichtouille.services.implementation;

import nuit.info.quichtouille.model.Boat;
import nuit.info.quichtouille.model.User;
import nuit.info.quichtouille.repositories.BoatRepository;
import nuit.info.quichtouille.services.BoatService;

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
    public Boat save(Boat boat) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
