package nuit.info.quichtouille.services.implementation;

import nuit.info.quichtouille.model.Person;
import nuit.info.quichtouille.repositories.BoatRepository;
import nuit.info.quichtouille.repositories.PersonRepository;
import nuit.info.quichtouille.services.PersonService;

import javax.annotation.Resource;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonRepository personRepository;

    //Repository Getters / Setters
    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public Person findById(long id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
