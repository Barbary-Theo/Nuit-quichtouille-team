package nuit.info.quichtouille.services;

import nuit.info.quichtouille.model.Rescue;

import java.util.List;

public interface RescueService {


    public Rescue findById(long id);
    public List<Rescue> findAll();
    public Rescue save(Rescue user);
    public void delete(long id);


}
