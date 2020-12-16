package com.bnpp.kata.tictactoe.impl;

import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import com.bnpp.kata.tictactoe.exception.PositionAlreadyOccupiedException;
import com.bnpp.kata.tictactoe.util.GameUtility;

import java.util.Scanner;
import java.util.logging.Logger;

import static com.bnpp.kata.tictactoe.constant.GameConstant.*;

public class TicTacToe {
    private static final Logger logger = Logger.getLogger(TicTacToe.class.getName());

    private String winner;
    private GameBoard board;

    public TicTacToe() {
        winner = null;
        board = new GameBoard();
    }

    void play() throws InvalidInputException, PositionAlreadyOccupiedException {
        logger.info(board.showBoard());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            logger.info(INPUT_MESSAGE + board.getCurrentPlayer());
            String inputPosition = scanner.next().trim();
            if (!GameUtility.isValidInput(inputPosition)) {
                throw new InvalidInputException(INVALID_POSITION_MESSAGE);
            }
            if (GameUtility.isPositionOccupied(board.getMovesPlayed(), inputPosition)) {
                throw new PositionAlreadyOccupiedException(POSITION_OCCUPIED_MESSAGE);
            }
            board.placeInputPositionAtBoardGrid(inputPosition);
            logger.info(board.showBoard());
            board.switchPlayer();
            if (board.getMovesPlayed().size() > NUMBER_FOUR) {
                winner = GameUtility.checkWinner(board.getGrid());
                if (winner != null) {
                    logger.info(winner + WINNER_MESSAGE);
                    break;
                }
            }
        }
    }

    public String getWinner() {
        return winner;
    }

    public GameBoard getBoard() {
        return board;
    }
}
