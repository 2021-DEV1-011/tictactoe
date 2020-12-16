package com.bnpp.kata.tictactoe.impl;

public class TicTacToe {
    private String winner;
    private GameBoard board;

    public TicTacToe() {
        winner = null;
        board = new GameBoard();
    }

    public String getWinner() {
        return winner;
    }

    public GameBoard getBoard() {
        return board;
    }
}
