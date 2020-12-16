package com.bnpp.kata.tictactoe.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilityTest {

    @ParameterizedTest
    @ValueSource(strings = {"1","2","3","4","5","6","7","8","9"})
    @DisplayName("Should take position one, two, three as a valid input")
    void isValidInput(String position) {
        assertTrue(GameUtility.isValidInput(position));
    }

    @Test
    @DisplayName("Should check if position played is occupied or not")
    void isPositionOccupied() {
        List<String> movesPlayed = new ArrayList<>();
        movesPlayed.add("1");
        movesPlayed.add("2");
        assertTrue(GameUtility.isPositionOccupied(movesPlayed,"1"));
        assertFalse(GameUtility.isPositionOccupied(movesPlayed,"3"));
    }
}