package com.bnpp.kata.tictactoe.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class GameUtilityTest {

    @ParameterizedTest
    @ValueSource(strings = {"1","2","3"})
    @DisplayName("Should take position one, two, three as a valid input")
    void isValidInput(String position) {
        assertTrue(GameUtility.isValidInput(position));
    }

}