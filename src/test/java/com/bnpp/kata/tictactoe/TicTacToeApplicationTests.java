package com.bnpp.kata.tictactoe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;

@SpringBootTest
class TicTacToeApplicationTests {

    @Test
    @DisplayName("Should play a tic tac toe game")
    void playGame() {
            System.setIn(new ByteArrayInputStream(("1\n2\n3\n4\n5\n7\n6\n9\n8".getBytes())));
            TicTacToeApplication.main(new String[]{});
    }
}
