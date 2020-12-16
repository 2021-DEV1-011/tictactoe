package com.bnpp.kata.tictactoe.impl;

import static com.bnpp.kata.tictactoe.constant.GameConstant.*;

public class GameBoard {
    private String[][] grid;

    public GameBoard() {
        grid = new String[ROW_SIZE][COLUMN_SIZE];
        grid[INDEX_ZERO][INDEX_ZERO] = "_";
        grid[0][1] = "_";
    }

    public String[][] getGrid() {
        return grid;
    }
}
