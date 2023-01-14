package com.thefabdev.springbws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thefabdev.springbws.shared.dto.UserDto;
import com.thefabdev.springbws.ui.model.request.UserDetailsRequestModel;
import com.thefabdev.springbws.ui.model.response.UserResponse;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "get user bbb";
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserDetailsRequestModel requestDetails) {
		return null;
	}
	
	@PutMapping
	public String updateUser() {
		return "update user";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user";
	}
}
