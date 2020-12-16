package com.bnpp.kata.tictactoe.impl;

import com.bnpp.kata.tictactoe.util.GameUtility;

import java.util.Scanner;
import java.util.logging.Logger;

public class TicTacToe {
    private static final Logger logger = Logger.getLogger(TicTacToe.class.getName());

    private String winner;
    private GameBoard board;

    public TicTacToe() {
        winner = null;
        board = new GameBoard();
    }

    void play() throws Exception {
        logger.info(board.showBoard());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            logger.info("Enter the position(1-9) for " + board.getCurrentPlayer());
            String inputPosition = scanner.next().trim();
            if (!GameUtility.isValidInput(inputPosition)) {
                throw new Exception("position entered is not valid");
            }
            board.placeInputPositionAtBoardGrid(inputPosition);
            logger.info(board.showBoard());
            board.switchPlayer();
        }
    }

    public String getWinner() {
        return winner;
    }

    public GameBoard getBoard() {
        return board;
    }
}
