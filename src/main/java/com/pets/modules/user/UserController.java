package com.pets.modules.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/user" })
public class UserController {
	
	private UserService userService;
	private UserRepository userRepository;
	
	public UserController(UserService userService, UserRepository userRepository) {
		super();
		this.userService = userService;
		this.userRepository = userRepository;
	}

	@PostMapping
	public User create(@RequestBody User user) {
		System.out.println(user);
		return userService.create(user);
	}

	@GetMapping
	public List<User> listUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public User getById(@PathVariable Long id) {
		return userRepository.findById(id).get();
	}
	
}
