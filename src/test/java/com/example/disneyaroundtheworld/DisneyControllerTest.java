package com.example.disneyaroundtheworld;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DisneyControllerTest {

    private DisneyController controller;

    @BeforeEach
    void setUp() {
        controller = new DisneyController();
    }

    @Test
    void searchByParkNameShouldFindTokyoDisneyland() {
        List<DisneyPark> results = controller.searchParks("Tokyo");

        assertEquals(1, results.size());
        assertEquals("Tokyo Disneyland", results.get(0).getName());
    }

    @Test
    void searchByLocationShouldFindMagicKingdom() {
        List<DisneyPark> results = controller.searchParks("Florida");

        assertEquals(1, results.size());
        assertEquals("Magic Kingdom", results.get(0).getName());
    }

    @Test
    void searchShouldReturnMultipleDisneylandResults() {
        List<DisneyPark> results = controller.searchParks("Disneyland");

        assertTrue(results.size() > 1);
    }

    @Test
    void searchWithNoMatchShouldReturnEmptyList() {
        List<DisneyPark> results = controller.searchParks("Australia");

        assertTrue(results.isEmpty());
    }
}
