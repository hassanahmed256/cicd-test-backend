package com.hassan.cicd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassan.cicd.models.Users;
import com.hassan.cicd.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	UsersRepository usersRepository;

	public List<Users> getAllUsers(){
		return usersRepository.findAll();
	}
}
