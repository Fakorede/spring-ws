package com.thefabdev.springbws.service;

import org.springframework.stereotype.Service;

import com.thefabdev.springbws.service.contract.UserServiceContract;
import com.thefabdev.springbws.shared.dto.UserDto;

@Service
public class UserService implements UserServiceContract {

	@Override
	public UserDto createUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

}
