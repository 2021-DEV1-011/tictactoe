package com.bnpp.kata.tictactoe.impl;

public class GameBoard {
    private String[][] grid;

    public GameBoard() {
        grid = new String[3][3];
        grid[0][0] = "_";
    }

    public String[][] getGrid() {
        return grid;
    }
}
