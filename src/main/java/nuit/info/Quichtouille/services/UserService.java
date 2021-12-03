package nuit.info.quichtouille.services;

import nuit.info.quichtouille.model.User;

import java.util.List;


public interface UserService {

    //Usual CRUD services
    public User findById(long id);
    public List<User> findAll();
    public User save(User user);
    public void delete(long id);

}
