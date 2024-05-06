package com.example.project_02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;

    @Before
    public void setUp() {

        user = new User("test_username", "test_password");
    }

    @Test
    public void testGettersAndSetters() {

        assertEquals("test_username", user.getUsername());
        assertEquals("test_password", user.getPassword());
        user.setUsername("new_username");
        user.setPassword("new_password");
        assertEquals("new_username", user.getUsername());
        assertEquals("new_password", user.getPassword());
    }

    @Test
    public void testIsProfessor() {
        assertFalse(user.isProfessor());
        user.setProfessor(true);
        assertTrue(user.isProfessor());

        user.setProfessor(false);
        assertFalse(user.isProfessor());
    }
}
