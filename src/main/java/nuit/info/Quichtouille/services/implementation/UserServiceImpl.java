package nuit.info.quichtouille.services.implementation;

import nuit.info.quichtouille.model.User;
import nuit.info.quichtouille.repositories.UserRepository;
import nuit.info.quichtouille.services.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;

    //Repository Getters / Setters
    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
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
