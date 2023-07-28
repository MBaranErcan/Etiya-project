package com.etiya.project.services;

import com.etiya.project.entities.UserEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface IUserBaseService {

    public Optional<UserEntity> findOneUserById(@RequestParam Long id);
    public List<UserEntity> getAllUsers();

}
