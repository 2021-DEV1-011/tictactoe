package com.bnpp.kata.tictactoe.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GameBoardTest {

    static Stream<Arguments> gridInput() {
        return Stream.of(
                arguments(0, 0),
                arguments(0, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("gridInput")
    @DisplayName("Should initialise first & second board position with blank value")
    void positionDefaultValue(int rowIndex, int columnIndex) {
        GameBoard board = new GameBoard();
        assertEquals("_",board.getGrid()[rowIndex][columnIndex]);
    }
}