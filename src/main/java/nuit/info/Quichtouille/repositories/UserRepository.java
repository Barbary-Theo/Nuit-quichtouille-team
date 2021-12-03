package nuit.info.Quichtouille.repositories;

import nuit.info.Quichtouille.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {


    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    List<User> findAll();

    @Override
    void deleteAll();
}
