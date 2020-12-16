package com.bnpp.kata.tictactoe.impl;

import com.bnpp.kata.tictactoe.exception.GameOverException;
import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import com.bnpp.kata.tictactoe.exception.PositionAlreadyOccupiedException;
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

    @Test
    @DisplayName("Should throw PositionAlreadyOccupiedException if input position is already played")
    public void throwPositionOccupiedExceptionWhilePlaying() {
        System.setIn(new ByteArrayInputStream("1\n2\n1".getBytes()));
        try {
            ticTacToe.play();
        } catch (Exception exception) {
            assertSame(PositionAlreadyOccupiedException.class,exception.getClass());
            assertSame("Position is already occupied",exception.getMessage());
        }
    }

    @Test
    @DisplayName("Should declare winner if any of the winning condition is met")
    public void declareWinner() throws Exception {
        System.setIn(new ByteArrayInputStream(("1\n2\n5\n4\n9").getBytes()));
        ticTacToe.play();
        assertEquals("X", ticTacToe.getWinner());
    }

    @Test
    @DisplayName("Should throw GameOverException if all input position are played without any winning condition being met")
    public void throwGameOverExceptionWhilePlaying() {
        System.setIn(new ByteArrayInputStream(("1\n2\n3\n4\n5\n7\n6\n9\n8".getBytes())));
        try {
            ticTacToe.play();
        }
        catch (Exception exception){
            assertSame(GameOverException.class, exception.getClass());
        }
    }
}