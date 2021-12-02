package nuit.info.Quichtouille.repositories;

import nuit.info.Quichtouille.model.User;
import nuit.info.quichtouille.model.Delivery;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {


    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    Iterable<User> findAll();

    @Override
    void deleteAll();
}
