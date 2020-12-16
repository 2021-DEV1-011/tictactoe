package com.bnpp.kata.tictactoe.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    @DisplayName("Should initialise first board position with blank value")
    void firstPositionDefault() {
        GameBoard board = new GameBoard();
        assertEquals("_",board.getGrid()[0][0]);
    }

    @Test
    @DisplayName("Should initialise second board position with blank value")
    void secondPositionDefault() {
        GameBoard board = new GameBoard();
        assertEquals("_",board.getGrid()[0][1]);
    }

}