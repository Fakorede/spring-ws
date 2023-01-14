package com.thefabdev.springbws.service.contract;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.thefabdev.springbws.shared.dto.UserDto;

public interface UserServiceContract extends UserDetailsService {
	UserDto createUser(UserDto user);
}
