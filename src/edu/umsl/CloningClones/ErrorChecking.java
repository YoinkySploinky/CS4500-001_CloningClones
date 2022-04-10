package edu.umsl.CloningClones;

public class ErrorChecking {

    public boolean errBoardSize(int x, int y) {

        if (x >= 8 && y >= 8) {
            if (x == y)
                return true;
            else {
                System.out.println("Error! The board is unequal! Please make sure to input equal X and Y parameters.");
                return false;
            }
        }
        else {
            System.out.println("Error! The board must be bigger than an  8 by 8! Please re-input parameters larger than 8.");
            return false;
        }
    }

    public boolean errMoveCheck(int moveX, int moveY, int boardY, int[][] board){

        if (moveX == 0) {
            System.out.println("Error! Attempted move will leave the board! Please try another checker.");
            return false;
        }
        if (moveY + 1 > boardY) {
            System.out.println("Error! Attempted move will leave the board! Please try another checker.");
            return false;
        }
        if (board[moveX-1][moveY] == 1) {
            System.out.println("Error! There is a piece already above this checker! Please try another checker.");
            return false;
        }
        if (board[moveX][moveY+1] == 1) {
            System.out.println("Error! There is a piece already to the right of this checker! Please try another checker.");
            return false;
        }
        return true;
    }

}
