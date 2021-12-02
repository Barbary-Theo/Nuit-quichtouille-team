package nuit.info.Quichtouille.services;

import nuit.info.Quichtouille.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    //Usual CRUD services
    public User findById(long id);
    public List<User> findAll();
    public User save(User user);
    public void delete(long id);

}
