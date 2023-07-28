package com.etiya.project.repository;

import com.etiya.project.DTOs.User;
import com.etiya.project.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByuName(String uName);
}
