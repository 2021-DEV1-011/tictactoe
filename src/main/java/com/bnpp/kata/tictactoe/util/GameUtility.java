package com.bnpp.kata.tictactoe.util;

import java.util.Arrays;
import java.util.List;

import static com.bnpp.kata.tictactoe.constant.GameConstant.*;

public class GameUtility {
    public static boolean isValidInput(String input) {
        return Arrays.asList(new String[]{POSITION_ONE, POSITION_TWO, POSITION_THREE, POSITION_FOUR, POSITION_FIVE, POSITION_SIX, POSITION_SEVEN, POSITION_EIGHT, POSITION_NINE}).contains(input);
    }

    public static boolean isPositionOccupied(List<String> movesPlayed, String position){
        return movesPlayed.contains(position);
    }

    public static String checkWinner(String [][] grid) {
        String winner = null;
        if (grid[INDEX_ZERO][INDEX_ZERO].equals(grid[INDEX_ZERO][INDEX_ONE]) && grid[INDEX_ZERO][INDEX_ZERO].equals(grid[INDEX_ZERO][INDEX_TWO])) {
            winner = grid[INDEX_ZERO][INDEX_ZERO];
        }
        else if (grid[INDEX_ZERO][INDEX_TWO].equals(grid[INDEX_ONE][INDEX_TWO]) && grid[INDEX_ZERO][INDEX_TWO].equals(grid[INDEX_TWO][INDEX_TWO])) {
            winner = grid[INDEX_ZERO][INDEX_TWO];
        }
        else if (grid[INDEX_TWO][INDEX_ZERO].equals(grid[INDEX_TWO][INDEX_ONE]) && grid[INDEX_TWO][INDEX_ZERO].equals(grid[INDEX_TWO][INDEX_TWO])) {
            winner = grid[INDEX_TWO][INDEX_ZERO];
        }
        else if (grid[INDEX_TWO][INDEX_ZERO].equals(grid[INDEX_ONE][INDEX_ZERO]) && grid[INDEX_TWO][INDEX_ZERO].equals(grid[INDEX_ZERO][INDEX_ZERO])) {
            winner = grid[INDEX_TWO][INDEX_ZERO];
        }
        else if (grid[INDEX_TWO][INDEX_ZERO].equals(grid[INDEX_ONE][INDEX_ONE]) && grid[INDEX_TWO][INDEX_ZERO].equals(grid[INDEX_ZERO][INDEX_TWO])) {
            winner = grid[INDEX_TWO][INDEX_ZERO];
        }
        else if (grid[INDEX_ZERO][INDEX_ZERO].equals(grid[INDEX_ONE][INDEX_ONE]) && grid[INDEX_ZERO][INDEX_ZERO].equals(grid[INDEX_TWO][INDEX_TWO])) {
            winner = grid[INDEX_ZERO][INDEX_ZERO];
        }
        else if (grid[INDEX_ZERO][INDEX_ONE].equals(grid[INDEX_ONE][INDEX_ONE]) && grid[INDEX_ZERO][INDEX_ONE].equals(grid[INDEX_TWO][INDEX_ONE])) {
            winner = grid[INDEX_ZERO][INDEX_ONE];
        }
        else if (grid[INDEX_ONE][INDEX_ZERO].equals(grid[INDEX_ONE][INDEX_ONE]) && grid[INDEX_ONE][INDEX_ZERO].equals(grid[INDEX_ONE][INDEX_TWO])) {
            winner = grid[INDEX_ONE][INDEX_ZERO];
        }
        if ( BLANK_VALUE.equals(winner) )
            winner = null;
        return winner;
    }
}
