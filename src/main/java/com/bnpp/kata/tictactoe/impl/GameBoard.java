package com.bnpp.kata.tictactoe.impl;

import java.util.ArrayList;
import java.util.List;

import static com.bnpp.kata.tictactoe.constant.GameConstant.*;

public class GameBoard {
    private String[][] grid;
    private String currentPlayer;
    private List<String> movesPlayed;

    public GameBoard() {
        grid = new String[ROW_SIZE][COLUMN_SIZE];
        for (int row = INDEX_ZERO; row < ROW_SIZE; row++) {
            for (int column = INDEX_ZERO; column < COLUMN_SIZE; column++) {
                grid[row][column] = BLANK_VALUE;
            }
        }
        currentPlayer = PLAYER_X;
        movesPlayed = new ArrayList<>();
    }

    String showBoard() {
        StringBuilder boardValue = new StringBuilder(NEWLINE_VALUE);
        for (int row = INDEX_ZERO; row < ROW_SIZE; row++) {
            StringBuilder rowValue = new StringBuilder(EMPTY_STRING);
            for (int column = INDEX_ZERO; column < COLUMN_SIZE; column++) {
                    rowValue.append(grid[row][column]).append(column != INDEX_TWO ? PIPE_VALUE : EMPTY_STRING);
            }
            boardValue.append(rowValue).append(NEWLINE_VALUE);
        }
        return boardValue.toString();
    }

    void switchPlayer() {
        currentPlayer = PLAYER_X.equals(currentPlayer) ? PLAYER_O : PLAYER_X;
    }

    void placeInputPositionAtBoardGrid(String inputPosition) {
        if ( POSITION_ONE.equals(inputPosition) ) {
            movesPlayed.add(inputPosition);
            grid[INDEX_ZERO][INDEX_ZERO] = currentPlayer;
        }
    }

    public String[][] getGrid() {
        return grid;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }
}
