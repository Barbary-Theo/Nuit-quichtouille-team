package nuit.info.Quichtouille.services.implementation;

import nuit.info.Quichtouille.model.User;
import nuit.info.Quichtouille.repositories.DeliveryRepository;
import nuit.info.Quichtouille.repositories.UserRepository;
import nuit.info.Quichtouille.services.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;

    //Repository Getters / Setters
    public UserRepository getDeliveryRepository() {
        return userRepository;
    }

    public void setDeliveryRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(long id) {

    }


}
