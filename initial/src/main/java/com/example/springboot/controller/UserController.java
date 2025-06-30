package com.example.springboot.controller;

import com.example.springboot.entity.EcaUser;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<EcaUser> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<EcaUser> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public EcaUser createUser(@RequestBody EcaUser user) {
        return userRepository.save(user);
    }

    @GetMapping("/search")
    public List<EcaUser> findByName(@RequestParam String name) {
        return userRepository.findByName(name);
    }
}