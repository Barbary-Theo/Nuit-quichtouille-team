package nuit.info.quichtouille.repositories;


import nuit.info.quichtouille.model.Boat;
import nuit.info.quichtouille.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BoatRepository extends CrudRepository<Boat, Long> {

    @Override
    <S extends Boat> S save(S entity);

    @Override
    Optional<Boat> findById(Long aLong);

    @Override
    Iterable<Boat> findAll();

    @Override
    void deleteAll();
}
