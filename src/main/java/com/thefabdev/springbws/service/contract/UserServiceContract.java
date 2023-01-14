package com.thefabdev.springbws.service.contract;

import com.thefabdev.springbws.shared.dto.UserDto;

public interface UserServiceContract {
	UserDto createUser(UserDto user);
}
