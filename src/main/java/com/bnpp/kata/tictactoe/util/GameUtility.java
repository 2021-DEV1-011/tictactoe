package com.bnpp.kata.tictactoe.util;

import static com.bnpp.kata.tictactoe.constant.GameConstant.*;

public class GameUtility {
    static boolean isValidInput(String input) {
        boolean result = false;
        if ( POSITION_ONE.equals(input) )
            result = true;
        else if ( POSITION_TWO.equals(input) )
            result = true;
        return result;
    }
}
