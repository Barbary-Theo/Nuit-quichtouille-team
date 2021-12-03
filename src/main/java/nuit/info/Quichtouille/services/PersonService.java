package nuit.info.quichtouille.services;

import nuit.info.quichtouille.model.Person;

import java.util.List;

public interface PersonService {

    //Usual CRUD services
    public Person findById(long id);
    public List<Person> findAll();
    public Person save(Person person);
    public void delete(long id);
}
