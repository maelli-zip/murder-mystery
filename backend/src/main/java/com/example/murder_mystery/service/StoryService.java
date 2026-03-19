package com.example.murder_mystery.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.murder_mystery.entity.Story;
import com.example.murder_mystery.repository.StoryRepository;

@Service
public class StoryService {

    private final StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<Story> getAllStories() throws IOException {
        return storyRepository.loadStories();
    }
}
