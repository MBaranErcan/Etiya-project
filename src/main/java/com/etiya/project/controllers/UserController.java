package com.etiya.project.controllers;

import com.etiya.project.DTOs.User;
import com.etiya.project.entities.UserEntity;
import com.etiya.project.exceptions.UserNotFoundException;
import com.etiya.project.requests.CreateUserRequest;
import com.etiya.project.requests.InquireUserRequest;
import com.etiya.project.responses.GenericResponse;
import com.etiya.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {   // CONTROLLERDA DTO OLUŞTURSUN ENTITY DİİL

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

/*    //GET /user/{id}
    @GetMapping("/get/user/{id}")
    public Optional<UserEntity> retrieveUser(@PathVariable Long id) {
        Optional<UserEntity> user = userService.findOneUserById(id);
        if (user == null) throw new UserNotFoundException("id" + id);

        return user;
    }*/

/*    //GET /all-users
    @GetMapping("/get/all-users")
    public List<UserEntity> retrieveAllUsers() {
        return userService.getAllUsers();
    }

    //DELETE /user/{id}
    @DeleteMapping("/delete/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        Optional<UserEntity> optUser = userService.findOneUserById(id);
        UserEntity user = optUser.orElseThrow(() -> new UserNotFoundException("No user found by id:" + id));
        userService.deleteUser(user);
    }*/


    //API : createUser
    @PostMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenericResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        return ResponseEntity.ok(userService.createUser(createUserRequest));
    }

    //API : inquireUser
    @GetMapping(value = "/inquireUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenericResponse<User>> inquireUser(@RequestBody InquireUserRequest inquireUserRequest) {
        return ResponseEntity.ok(userService.inquireUser(inquireUserRequest));
    }

}
