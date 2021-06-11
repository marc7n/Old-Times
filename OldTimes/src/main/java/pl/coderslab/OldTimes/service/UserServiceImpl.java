package pl.coderslab.OldTimes.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.OldTimes.dao.UserRepository;
import pl.coderslab.OldTimes.entity.User;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository theUserRepository) {
		userRepository = theUserRepository;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}


	@Override
	public User findById(int theId) {
		Optional<User> result = userRepository.findById(theId);

		User theUser = null;
		
		if (result.isPresent()) {
			theUser= result.get();
		}
		else {
			throw new RuntimeException("Did not find user id - " + theId);
		}
		
		return theUser;
	}

	@Override
	public void save(User theUser) {
		userRepository.save(theUser);
	}



}






