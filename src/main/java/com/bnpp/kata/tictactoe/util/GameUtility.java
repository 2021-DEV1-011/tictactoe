package com.bnpp.kata.tictactoe.util;

import static com.bnpp.kata.tictactoe.constant.GameConstant.*;

public class GameUtility {
    static boolean isValidInput(String input) {
        if ( POSITION_ONE.equals(input) )
            return true;
        return false;
    }
}
