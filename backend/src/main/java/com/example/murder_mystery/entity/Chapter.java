package com.example.murder_mystery.entity;

import java.util.List;

import lombok.Data;

@Data
public class Chapter {

    private int order;
    private String title;
    private String narrative;
    private List<String> involvedCharacterIds;

}
