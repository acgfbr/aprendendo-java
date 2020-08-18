package com.aprendendojava.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendojava.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
