package com.springboot.socialapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.socialapp.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

}
