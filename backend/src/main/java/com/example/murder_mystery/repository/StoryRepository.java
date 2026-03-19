package com.example.murder_mystery.repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.example.murder_mystery.entity.Story;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class StoryRepository {

    private static final String STORIES_JSON_PATH = "data/stories.json";

    private final ObjectMapper objectMapper;

    public StoryRepository(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Story> loadStories() throws IOException {
        ClassPathResource resource = new ClassPathResource(STORIES_JSON_PATH);
        try (InputStream inputStream = resource.getInputStream()) {
            return objectMapper.readValue(inputStream, new TypeReference<List<Story>>() {});
        } catch (IOException e) {
            throw new IOException("Failed to load stories from JSON file", e);
        }
    }
}
