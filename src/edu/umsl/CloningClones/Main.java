import java.util.*;

public class Main {

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

    public static void main(String[] args) {
        int x = 8, y = 8;
        int[][] board;
        board = setBoard(x, y);
        displayBoard(x, y, board);
    }
}
