package com.example.springboot.entity;

import jakarta.persistence.*;

@Entity
public class EcaUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
}
