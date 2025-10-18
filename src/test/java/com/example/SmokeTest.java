package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SmokeTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void should_load_application_context_success() {
        assertNotNull(applicationContext);
    }
}