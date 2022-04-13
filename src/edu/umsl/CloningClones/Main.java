package edu.umsl.CloningClones;
import java.util.*;

public class Main {

    static ErrorChecking error = new ErrorChecking();
    static Scanner userInput = new Scanner(System.in);

    public static int[][] setBoard(int x, int y) {

        int[][]board = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = 0;
            }
        }

        //place 1's into prison position
        board[x-1][0] = 1;
        board[x-2][0] = 1;
        board[x-1][1] = 1;

        return board;
    }

    public static void displayBoard(int x, int y, int[][] board) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("[" + board[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }

    public static int[][] makeMove(int x, int y, int moveX, int moveY, int board[][]) {
        boolean errCheck = false;
        int[][]moveBoard = new int[x][y];

        while(!errCheck) {
            errCheck = error.errMoveCheck(moveX, moveY, x, board);
            if (errCheck == true) {
                moveBoard = board;
                moveBoard[moveX][moveY] = 0;
                moveBoard[moveX - 1][moveY] = 1;
                moveBoard[moveX][moveY + 1] = 1;
                break;
            }
            else {
                moveX = userInput.nextInt() - 1;
                moveY = userInput.nextInt() - 1;
            }
        }

        return moveBoard;
    }

    public static int[][] resetBoard(int x, int y, int[][] board) {
        int[][]resetBoard;
        System.out.println("Would you like to reset the board?");
        String input = userInput.next();

        if (input.equalsIgnoreCase("yes")) {
            resetBoard = setBoard(x, y);
            return resetBoard;
        }
        return board;
    }

    public static boolean getMeOuttaHere() {

        System.out.println("Would you like to exit the game");
        String input = userInput.next();

        if (input.equalsIgnoreCase("yes")) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        int x = 0, y = 0, newX = 0, newY = 0;
        int[][] board;
        boolean exit = false, errBoard = false;

        while(!errBoard) {
            System.out.println("What are the dimensions for this board?");
            x = userInput.nextInt();
            y = userInput.nextInt();
            errBoard = error.errBoardSize(x, y);
        }
        board = setBoard(x, y);

        while(!exit) {

            displayBoard(x, y, board);

            System.out.println("What are the coordinates of your first move?");
            newX = userInput.nextInt() - 1;
            newY = userInput.nextInt() - 1;
            board = makeMove(x, y, newX, newY, board);

            System.out.println();
            System.out.println();
            System.out.println();
            displayBoard(x, y, board);

            board = resetBoard(x, y, board);

            exit = getMeOuttaHere();

        }
    }
}
