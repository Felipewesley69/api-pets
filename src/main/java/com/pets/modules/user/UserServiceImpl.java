package com.pets.modules.user;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User create(User user) {
		return userRepository.save(user);
	}

}
