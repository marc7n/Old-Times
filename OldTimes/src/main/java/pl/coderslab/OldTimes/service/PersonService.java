package pl.coderslab.OldTimes.service;

import pl.coderslab.OldTimes.entity.Person;

import java.util.List;

public interface PersonService {

    public List<Person> findAll();

    public Person findById(int theId);

    public void save(Person thePerson);

    public void deleteById(int theId);



}