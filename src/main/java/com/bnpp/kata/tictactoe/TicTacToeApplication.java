package com.bnpp.kata.tictactoe;

import com.bnpp.kata.tictactoe.exception.GameOverException;
import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import com.bnpp.kata.tictactoe.exception.PositionAlreadyOccupiedException;
import com.bnpp.kata.tictactoe.impl.TicTacToe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

import static com.bnpp.kata.tictactoe.constant.GameConstant.GAME_RULES;

@SpringBootApplication
public class TicTacToeApplication {
	private static final Logger logger = Logger.getLogger(TicTacToeApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeApplication.class, args);
		logger.info(displayRules());
		TicTacToe ticTacToe = new TicTacToe();
		try {
			ticTacToe.play();
		} catch (InvalidInputException | PositionAlreadyOccupiedException | GameOverException exception) {
			logger.severe(exception.getMessage());
		}
	}

	private static String displayRules() {
		return GAME_RULES;
	}

}
