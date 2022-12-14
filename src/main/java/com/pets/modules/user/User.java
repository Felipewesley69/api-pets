package com.pets.modules.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "password", nullable = false, length =8)
	private String password;
	
	@Column(name = "name", nullable = false, length = 200)
	private String name;
	
	@Column(name = "sex", nullable = false, length = 20)
	private String sex;
	
}
