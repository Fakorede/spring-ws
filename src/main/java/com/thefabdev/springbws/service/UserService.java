package com.thefabdev.springbws.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.thefabdev.springbws.UserRepository;
import com.thefabdev.springbws.io.entity.UserEntity;
import com.thefabdev.springbws.service.contract.UserServiceContract;
import com.thefabdev.springbws.shared.Utils;
import com.thefabdev.springbws.shared.dto.UserDto;

@Service
public class UserService implements UserServiceContract {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDto createUser(UserDto user) {
		UserEntity storedUserDetails = userRepository.findByEmail(user.getEmail());
		
		if (storedUserDetails != null) {
			throw new RuntimeException("Record already exists");
		}
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userEntity.setUserId(utils.generateUserId(30));
		
		UserEntity savedUser = userRepository.save(userEntity);
		
		UserDto data = new UserDto();
		BeanUtils.copyProperties(savedUser, data);
		
		return data;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

}
