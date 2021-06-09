package pl.coderslab.OldTimes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.OldTimes.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {


        }