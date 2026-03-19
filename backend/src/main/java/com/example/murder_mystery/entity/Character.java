package com.example.murder_mystery.entity;

import lombok.Data;

@Data
public class Character {

    private String id;
    private String name;
    private String role;
    private String description;
    private String imagePath;
    private boolean isSuspect;

}
