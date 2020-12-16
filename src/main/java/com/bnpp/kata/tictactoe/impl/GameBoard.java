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
        String boardValue = NEWLINE_VALUE;
        for (int row = INDEX_ZERO; row < ROW_SIZE; row++) {
            String rowValue = EMPTY_STRING;
            for (int column = INDEX_ZERO; column < COLUMN_SIZE; column++) {
                if ( column != INDEX_TWO )
                    rowValue += grid[row][column] + PIPE_VALUE ;
                else
                    rowValue += grid[row][column] ;
            }
            boardValue += rowValue + NEWLINE_VALUE;
        }
        return boardValue;
    }

    public String[][] getGrid() {
        return grid;
    }
}
