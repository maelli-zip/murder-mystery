package com.example.murder_mystery.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.murder_mystery.entity.Story;
import com.example.murder_mystery.service.StoryService;

@RestController
@RequestMapping("/api/stories")
@CrossOrigin(origins = "*")
public class StoryController {

    private final StoryService storyService;

    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Story>> getAllStories() throws IOException {
        return ResponseEntity.ok(storyService.getAllStories());
    }
}
