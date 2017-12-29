package com.dhiro.infomorf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiro.infomorf.model.UserModel;

public interface UserLoginRepository extends JpaRepository<UserModel, Long> {
	UserModel findByUsername(String username);
}
