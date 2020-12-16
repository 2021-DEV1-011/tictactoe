package com.bnpp.kata.tictactoe.impl;

import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;

    @BeforeEach
    public void initialSetup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    @DisplayName("Should initialise tic tac toe board and winner")
    public void initialiseGame() {
        assertNull(ticTacToe.getWinner());
        assertNotNull(ticTacToe.getBoard());
    }

    @Test
    @DisplayName("Should throw InvalidInputException on invalid input while playing")
    public void throwExceptionWhilePlaying() {
        System.setIn(new ByteArrayInputStream("10".getBytes()));
        try {
            ticTacToe.play();
        } catch (Exception exception) {
            assertSame(InvalidInputException.class,exception.getClass());
            assertSame("Position entered is not valid",exception.getMessage());
        }
    }
}