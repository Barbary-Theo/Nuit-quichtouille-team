package nuit.info.quichtouille.services.implementation;

import nuit.info.quichtouille.model.Rescue;
import nuit.info.quichtouille.repositories.BoatRepository;
import nuit.info.quichtouille.repositories.RescueRepository;
import nuit.info.quichtouille.services.RescueService;

import javax.annotation.Resource;
import java.util.List;

public class RescueServiceImpl implements RescueService {

    @Resource
    private RescueRepository rescueRepository;

    //Repository Getters / Setters
    public RescueRepository getRescueRepository() {
        return rescueRepository;
    }

    public void setRescueRepository(RescueRepository rescueRepository) {
        this.rescueRepository = rescueRepository;
    }


    @Override
    public Rescue findById(long id) {
        return null;
    }

    @Override
    public List<Rescue> findAll() {
        return null;
    }

    @Override
    public Rescue save(Rescue user) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
