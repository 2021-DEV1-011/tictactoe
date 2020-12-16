package com.bnpp.kata.tictactoe.impl;

import static com.bnpp.kata.tictactoe.constant.GameConstant.*;

public class GameBoard {
    private String[][] grid;

    public GameBoard() {
        grid = new String[ROW_SIZE][COLUMN_SIZE];
        for (int row = INDEX_ZERO; row < ROW_SIZE; row++) {
            for (int column = INDEX_ZERO; column < COLUMN_SIZE; column++) {
                grid[row][column] = BLANK_VALUE;
            }
        }
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

    public String[][] getGrid() {
        return grid;
    }
}
