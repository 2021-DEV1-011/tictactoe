package com.bnpp.kata.tictactoe;

import com.bnpp.kata.tictactoe.exception.GameOverException;
import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import com.bnpp.kata.tictactoe.exception.PositionAlreadyOccupiedException;
import com.bnpp.kata.tictactoe.impl.TicTacToe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

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
		return "Welcome to BNPPF KATA Tic Tac Toe\n" +
				"Rules for this game are as follows: \n" +
				"1. Player 1: X always goes first \n" +
				"2. Players cannot play on a played position\n" +
				"3. Players can play alternatively until one of them WINS the game or it leads to a DRAW\n" +
				"4. A Player is said to WIN only if they have 3 X's or O's in a row completed\n" +
				"5. Game is said to be DRAW if the players exhausts all the 9 positions\n" +
				"6. You need to input your position starting from 1 till 9, where 1 is top left corner and 9 being bottom right corner";
	}

}
