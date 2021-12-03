package nuit.info.quichtouille.repositories;

import nuit.info.quichtouille.model.Person;
import nuit.info.quichtouille.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {
    @Override
    <S extends Person> S save(S entity);

    @Override
    Optional<Person> findById(Long aLong);

    @Override
    Iterable<Person> findAll();

    @Override
    void deleteAll();
}
