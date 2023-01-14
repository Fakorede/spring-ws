package com.thefabdev.springbws.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thefabdev.springbws.UserRepository;
import com.thefabdev.springbws.io.entity.UserEntity;
import com.thefabdev.springbws.service.contract.UserServiceContract;
import com.thefabdev.springbws.shared.dto.UserDto;

@Service
public class UserService implements UserServiceContract {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user) {
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId("testUserId");
		
		UserEntity savedUser = userRepository.save(userEntity);
		
		UserDto data = new UserDto();
		BeanUtils.copyProperties(savedUser, data);
		
		return data;
	}

}
