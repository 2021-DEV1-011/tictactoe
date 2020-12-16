package com.bnpp.kata.tictactoe.util;

import com.bnpp.kata.tictactoe.impl.GameBoard;
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

    @Test
    @DisplayName("Should declare winner if the 1st row of the board is played by same player")
    void firstRowWinner() {
        GameBoard board = new GameBoard();
        assertNull(GameUtility.checkWinner(board.getGrid()));
        board.placeInputPositionAtBoardGrid("1");
        board.placeInputPositionAtBoardGrid("2");
        board.placeInputPositionAtBoardGrid("3");
        assertEquals("X", GameUtility.checkWinner(board.getGrid()));
    }

    @Test
    @DisplayName("Should declare winner if the 3rd column of the board is played by same player")
    void thirdColumnWinner() {
        GameBoard board = new GameBoard();
        assertNull(GameUtility.checkWinner(board.getGrid()));
        board.placeInputPositionAtBoardGrid("3");
        board.placeInputPositionAtBoardGrid("6");
        board.placeInputPositionAtBoardGrid("9");
        assertEquals("X", GameUtility.checkWinner(board.getGrid()));
    }

    @Test
    @DisplayName("Should declare winner if the 3rd row of the board is played by same player")
    void thirdRowWinner() {
        GameBoard board = new GameBoard();
        assertNull(GameUtility.checkWinner(board.getGrid()));
        board.placeInputPositionAtBoardGrid("1");
        board.placeInputPositionAtBoardGrid("5");
        board.placeInputPositionAtBoardGrid("7");
        board.placeInputPositionAtBoardGrid("8");
        board.placeInputPositionAtBoardGrid("9");
        assertEquals("X", GameUtility.checkWinner(board.getGrid()));
    }

    @Test
    @DisplayName("Should declare winner if the 1st column of the board is played by same player")
    void firstColumnWinner() {
        GameBoard board = new GameBoard();
        assertNull(GameUtility.checkWinner(board.getGrid()));
        board.placeInputPositionAtBoardGrid("2");
        board.placeInputPositionAtBoardGrid("6");
        board.placeInputPositionAtBoardGrid("1");
        board.placeInputPositionAtBoardGrid("4");
        board.placeInputPositionAtBoardGrid("7");
        assertEquals("X", GameUtility.checkWinner(board.getGrid()));
    }

    @Test
    @DisplayName("Should declare winner if the diagonal of the board is played by same player")
    void rightDiagonalWinner() {
        GameBoard board = new GameBoard();
        assertNull(GameUtility.checkWinner(board.getGrid()));
        board.placeInputPositionAtBoardGrid("3");
        board.placeInputPositionAtBoardGrid("5");
        board.placeInputPositionAtBoardGrid("7");
        assertEquals("X", GameUtility.checkWinner(board.getGrid()));
    }
}