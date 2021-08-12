package com.brunopiva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopiva.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
