package nuit.info.quichtouille.repositories;

import nuit.info.quichtouille.model.Boat;
import nuit.info.quichtouille.model.Rescue;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RescueRepository extends CrudRepository<Rescue, Long> {

    @Override
    <S extends Rescue> S save(S entity);

    @Override
    Optional<Rescue> findById(Long aLong);

    @Override
    Iterable<Rescue> findAll();

    @Override
    void deleteAll();
}
