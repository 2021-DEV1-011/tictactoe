package com.bnpp.kata.tictactoe.impl;

import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    @DisplayName("Should initialise tic tac toe board and winner")
    public void initialiseGame() {
        TicTacToe ticTacToe = new TicTacToe();
        assertNull(ticTacToe.getWinner());
        assertNotNull(ticTacToe.getBoard());
    }

    @Test
    @DisplayName("Should throw InvalidInputException on invalid input while playing")
    public void throwExceptionWhilePlaying() {
        TicTacToe game = new TicTacToe();
        System.setIn(new ByteArrayInputStream("10".getBytes()));
        try {
            game.play();
        } catch (Exception exception) {
            assertSame(InvalidInputException.class,exception.getClass());
            assertSame("Position entered is not valid",exception.getMessage());
        }
    }
}