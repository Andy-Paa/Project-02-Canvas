package com.example.project_02;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class HWTest {
    private HW hw;
    @Before
    public void setUp() {
        hw = new HW();
    }
    @Test
    public void testGettersAndSetters() {
        assertNull(hw.getTitle());
        assertNull(hw.getDescription());
        hw.setTitle("Test Title");
        hw.setDescription("Test Description");

        assertEquals("Test Title", hw.getTitle());
        assertEquals("Test Description", hw.getDescription());
        hw.setTitle(null);
        hw.setDescription(null);
        assertNull(hw.getTitle());
        assertNull(hw.getDescription());
    }

    @Test
    public void testId() {
        assertEquals(0, hw.getId());
        hw.setId(1);
        assertEquals(1, hw.getId());
        hw.setId(100);
        assertEquals(100, hw.getId());
    }
}
