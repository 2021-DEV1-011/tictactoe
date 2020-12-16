# Tic Tac Toe 

## About this game
This is a Java based program that represents a Tic-tac-toe game for two players X & O, who take turns marking the spaces in a 3X3 matrix board as depicted below. 
```
Board and Position mapping

  Board      Position
_ | _ | _     1 | 2 | 3
_ | _ | _  => 4 | 5 | 6
_ | _ | _     7 | 8 | 9
```
# Rules to play the game
```
The rules are described below :
1) X always goes first.
2) Players cannot play on an already filled position.
3) Players take alternate turns to place X’s and O’s on the board until either player wins.
4) If a player is able to draw three X’s or three O’s in a horizontal, vertical or diagonal sequence, that player wins.
5) If all nine squares are filled and neither player has three in a sequence, the game is a draw.
```
# Set up application in Intellij IDE
```
1) Download project as zip file and unzip the same to a folder. 
2) In Intellij IDE,  Go to the below path
   File -> New -> Project from Existing Sources -> Next -> 
   Browse extracted folder and OK ->Import Project from External model -> Maven
3) IDE will import your maven project 
```
# Run application in Intellij IDE
```
1. Navigate and open the class src/main/java/com/bnpp/kata/tictactoe/TicTacToeApplication.java
2. Go to Run -> Run -> TicTacToeApplication or right click on the TicTacToeApplication.java and select "Run TicTacToeApplication.main()"
```