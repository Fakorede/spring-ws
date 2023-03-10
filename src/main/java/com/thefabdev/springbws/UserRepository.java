package com.thefabdev.springbws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thefabdev.springbws.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
}
