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

    public void placeInputPositionAtBoardGrid(String inputPosition) {
        movesPlayed.add(inputPosition);
        switch (inputPosition) {
            case POSITION_ONE:
                grid[INDEX_ZERO][INDEX_ZERO] = currentPlayer;
                break;
            case POSITION_TWO:
                grid[INDEX_ZERO][INDEX_ONE] = currentPlayer;
                break;
            case POSITION_THREE:
                grid[INDEX_ZERO][INDEX_TWO] = currentPlayer;
                break;
            case POSITION_FOUR:
                grid[INDEX_ONE][INDEX_ZERO] = currentPlayer;
                break;
            case POSITION_FIVE:
                grid[INDEX_ONE][INDEX_ONE] = currentPlayer;
                break;
            case POSITION_SIX:
                grid[INDEX_ONE][INDEX_TWO] = currentPlayer;
                break;
            case POSITION_SEVEN:
                grid[INDEX_TWO][INDEX_ZERO] = currentPlayer;
                break;
            case POSITION_EIGHT:
                grid[INDEX_TWO][INDEX_ONE] = currentPlayer;
                break;
            case POSITION_NINE:
                grid[INDEX_TWO][INDEX_TWO] = currentPlayer;
                break;
        }
    }

    public String[][] getGrid() {
        return grid;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public List<String> getMovesPlayed() {
        return movesPlayed;
    }
}
