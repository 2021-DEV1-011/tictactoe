package com.bnpp.kata.tictactoe.constant;

public class GameConstant {
    public static final int NUMBER_ZERO = 0 ;
    public static final int NUMBER_ONE = 1 ;
    public static final int NUMBER_TWO = 2 ;
    public static final int NUMBER_THREE = 3 ;
    public static final int NUMBER_FOUR = 4;
    public static final int NUMBER_EIGHT = 8 ;
    public static final int ROW_SIZE = NUMBER_THREE;
    public static final int COLUMN_SIZE = NUMBER_THREE;
    public static final int INDEX_ZERO = NUMBER_ZERO;
    public static final int INDEX_ONE = NUMBER_ONE;
    public static final int INDEX_TWO = NUMBER_TWO;

    public static final String BLANK_VALUE = "_";
    public static final String NEWLINE_VALUE = "\n";
    public static final String EMPTY_STRING = "";
    public static final String PIPE_VALUE = " | ";
    public static final String PLAYER_X = "X";
    public static final String PLAYER_O = "O";

    public static final String POSITION_ONE = "1";
    public static final String POSITION_TWO = "2";
    public static final String POSITION_THREE = "3";
    public static final String POSITION_FOUR = "4";
    public static final String POSITION_FIVE = "5";
    public static final String POSITION_SIX = "6";
    public static final String POSITION_SEVEN = "7";
    public static final String POSITION_EIGHT = "8";
    public static final String POSITION_NINE = "9";

    public static final String INPUT_MESSAGE = "Enter the position(1-9) for ";
    public static final String INVALID_POSITION_MESSAGE = "Position entered is not valid";
    public static final String POSITION_OCCUPIED_MESSAGE = "Position is already occupied";
    public static final String WINNER_MESSAGE = " player Wins!!!";
    public static final String GAME_OVER_MESSAGE = "It's a DRAW!!! All the moves have been exhausted";

    public static final String GAME_RULES = "Welcome to BNPPF KATA Tic Tac Toe\n" +
            "Rules for this game are as follows: \n" +
            "1. Player 1: X always goes first \n" +
            "2. Players cannot play on a played position\n" +
            "3. Players can play alternatively until one of them WINS the game or it leads to a DRAW\n" +
            "4. A Player is said to WIN only if they have 3 X's or O's in a row completed\n" +
            "5. Game is said to be DRAW if the players exhausts all the 9 positions\n" +
            "6. You need to input your position starting from 1 till 9, where 1 is top left corner and 9 being bottom right corner";

}
