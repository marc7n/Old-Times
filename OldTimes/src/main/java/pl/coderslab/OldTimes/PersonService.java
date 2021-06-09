package pl.coderslab.OldTimes;

import java.util.List;

public interface PersonService {

    public List<Person> findAll();

    public Person findById(int theId);

    public void save(Person thePerson);

    public void deleteById(int theId);

}