package com.jsp.schoolmanagement.controller;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jsp.schoolmanagement.constants.MappingConstants;
import com.jsp.schoolmanagement.entity.UserEntity;
import com.jsp.schoolmanagement.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = MappingConstants.LOGIN)
    public ResponseEntity<?> login(@RequestBody UserEntity userEntity) {
        Optional<UserEntity> existingUser = userService.findByUsername(userEntity.getUsername());
        if (existingUser.isPresent() && existingUser.get().getPassword().equals(userEntity.getPassword())) {
            return ResponseEntity.ok(existingUser);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping(value = MappingConstants.REGISTER)
    public ResponseEntity<?> register(@RequestBody UserEntity userEntity) {
        userService.save(userEntity);
        return ResponseEntity.ok("User registered");
    }

    @GetMapping(value = MappingConstants.GET_USER_BY_ID)
    public ResponseEntity<?> getUserProfile(@PathVariable Long id) {
        Optional<UserEntity> userEntity = userService.findById(id);
        return userEntity.map(ResponseEntity::ok).orElseThrow();
    }
}

