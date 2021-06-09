package pl.coderslab.OldTimes.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.OldTimes.dao.PersonRepository;
import pl.coderslab.OldTimes.entity.Person;

import java.util.List;
import java.util.Optional;


@Service
public class PersonServiceImpl implements PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonServiceImpl(PersonRepository thePersonRepository) {
		personRepository = thePersonRepository;
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}


	@Override
	public Person findById(int theId) {
		Optional<Person> result = personRepository.findById(theId);

		Person thePerson = null;
		
		if (result.isPresent()) {
			thePerson= result.get();
		}
		else {
			throw new RuntimeException("Did not find person id - " + theId);
		}
		
		return thePerson;
	}

	@Override
	public void save(Person thePerson) {
		personRepository.save(thePerson);
	}

	@Override
	public void deleteById(int theId) {
		personRepository.deleteById(theId);
	}

}






