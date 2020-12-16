package com.bnpp.kata.tictactoe.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GameBoardTest {
    GameBoard board;

    @BeforeEach
    public void initialSetup() {
        board = new GameBoard();
    }

    static Stream<Arguments> gridInput() {
        return Stream.of(
                arguments(0, 0),
                arguments(0, 1),
                arguments(0, 2),
                arguments(1, 0),
                arguments(1, 1),
                arguments(1, 2),
                arguments(2, 0),
                arguments(2, 1),
                arguments(2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("gridInput")
    @DisplayName("Should initialise all position with blank value")
    void positionDefaultValue(int rowIndex, int columnIndex) {
        assertEquals("_",board.getGrid()[rowIndex][columnIndex]);
    }

    @Test
    @DisplayName("Should display plain board structure")
    void showBoard() {
        String structure = "\n_ | _ | _\n_ | _ | _\n_ | _ | _\n";
        assertEquals(structure,board.showBoard());
    }

    @Test
    @DisplayName("Should have default player X to start the game")
    void defaultPlayerOfGame() {
        assertEquals("X",board.getCurrentPlayer());
    }

    @Test
    @DisplayName("Should have the next player as O")
    void nextPlayer() {
        assertEquals("X", board.getCurrentPlayer());
        board.switchPlayer();
        assertEquals("O", board.getCurrentPlayer());
    }

    @Test
    @DisplayName("Should switch player of the game accordingly")
    void switchPlayer() {
        assertEquals("X", board.getCurrentPlayer());
        board.switchPlayer();
        assertEquals("O", board.getCurrentPlayer());
        board.switchPlayer();
        assertEquals("X", board.getCurrentPlayer());
    }

    static Stream<Arguments> gridInputToBePlaced() {
        return Stream.of(
                arguments("1", 0, 0),
                arguments("2", 0, 1),
                arguments("3", 0, 2),
                arguments("4", 1, 0),
                arguments("5", 1, 1),
                arguments("6", 1, 2),
                arguments("7", 2, 0),
                arguments("8", 2, 1),
                arguments("9", 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("gridInputToBePlaced")
    @DisplayName("Should place & track player at various position on the board grid")
    void placePositionOnBoard(String position,int rowIndex, int columnIndex) {
        board.placeInputPositionAtBoardGrid(position);
        assertEquals("X",board.getGrid()[rowIndex][columnIndex]);
    }

}