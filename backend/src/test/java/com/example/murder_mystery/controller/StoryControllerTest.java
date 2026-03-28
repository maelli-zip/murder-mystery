package com.example.murder_mystery.controller;

import com.example.murder_mystery.entity.Story;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StoryControllerTest {
    // TODO: https://spring.io/guides/gs/testing-web

    @Autowired
    private StoryController storyController;

    @Test
    void getAllStories() throws IOException {
        ResponseEntity<List<Story>> response = storyController.getAllStories();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(3, response.getBody().size());
    }
}