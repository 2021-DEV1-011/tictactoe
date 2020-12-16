package com.bnpp.kata.tictactoe.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilityTest {

    @Test
    @DisplayName("Should take position one as a valid input")
    void isPositionOneValidInput() {
        assertTrue(GameUtility.isValidInput("1"));
    }

    @Test
    @DisplayName("Should take position two as a valid input")
    void isPositionTwoValidInput() {
        assertTrue(GameUtility.isValidInput("2"));
    }
}