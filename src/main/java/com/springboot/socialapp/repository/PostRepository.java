package com.springboot.socialapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.socialapp.model.PostModel;

public interface PostRepository extends JpaRepository<PostModel, Long> {

}
