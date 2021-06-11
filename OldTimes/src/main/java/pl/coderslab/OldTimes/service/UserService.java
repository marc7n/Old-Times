package pl.coderslab.OldTimes.service;

import pl.coderslab.OldTimes.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User findById(int theId);

    public void save(User theUser);


}

