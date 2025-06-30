package com.example.springboot.repository;

import com.example.springboot.entity.EcaUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<EcaUser, Long> {
    List<EcaUser> findByName(String name);
    Optional<EcaUser> findById(Long id);
}