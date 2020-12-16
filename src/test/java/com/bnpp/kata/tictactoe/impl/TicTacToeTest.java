package com.bnpp.kata.tictactoe.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    @DisplayName("Should initialise tic tac toe board and winner")
    public void initialiseGame() {
        TicTacToe ticTacToe = new TicTacToe();
        assertNull(ticTacToe.getWinner());
        assertNotNull(ticTacToe.getBoard());
    }
}