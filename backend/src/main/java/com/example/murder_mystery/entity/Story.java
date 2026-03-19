package com.example.murder_mystery.entity;

import java.util.List;

import lombok.Data;

@Data
public class Story {

    private String id;
    private String title;
    private String description;
    private String difficulty;
    private List<Character> characters;
    private List<Chapter> chapters;
    
}
