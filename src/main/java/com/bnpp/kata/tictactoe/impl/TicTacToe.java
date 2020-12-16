package com.bnpp.kata.tictactoe.impl;

import com.bnpp.kata.tictactoe.util.GameUtility;

import java.util.Scanner;
import java.util.logging.Logger;

import static com.bnpp.kata.tictactoe.constant.GameConstant.INPUT_MESSAGE;
import static com.bnpp.kata.tictactoe.constant.GameConstant.INVALID_POSITION_MESSAGE;

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
            logger.info(INPUT_MESSAGE + board.getCurrentPlayer());
            String inputPosition = scanner.next().trim();
            if (!GameUtility.isValidInput(inputPosition)) {
                throw new Exception(INVALID_POSITION_MESSAGE);
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
