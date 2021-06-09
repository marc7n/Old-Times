package pl.coderslab.OldTimes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.OldTimes.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {



        }