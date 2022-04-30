package edu.umsl.CloningClones;
import java.util.*;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Main extends Application{

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
    public void start (Stage primaryStage) {
        // Create a GridPane
        FlowPane rootPane = new FlowPane();
        rootPane.setHgap(5);
        GridPane pane = new GridPane();
        Scanner input = new Scanner(System.in);

        // Create rectangles and add to pane
        int count = 0;
        double s = 80;// side of rectangle
        System.out.println("Enter the square size you would like:");
        int z = input.nextInt();
        if(z>8 && z<15) s = 45;
        else if(z>14 && z<21) s=32;
        if (z%2 == 0){ //only works for even numbers
            for (int i = 0; i < z; i++) {
                count++;
                for (int j = 0; j < z; j++) {
                    Rectangle r = new Rectangle(s, s, s, s);
                    if (count % 2 == 0)
                        r.setFill(Color.WHITE);
                    pane.add(r, j, i);
                    count++;
                }
            }
        }
        else { //only works for odd numbers
            for (int i = 0; i < z; i++) {
                for (int j = 0; j < z; j++) {
                    Rectangle r = new Rectangle(s, s, s, s);
                    if (count % 2 == 0) {
                        r.setFill(Color.WHITE);
                    }
                    pane.add(r, j, i);
                    count++;
                }
            }
        }
        HBox newPane = new HBox();
        ImageView us = new ImageView(new Image("./pictures/mascot1.png"));
        us.setFitHeight(100);
        us.setFitWidth(100);
        us.setPreserveRatio(true);
        Label lb1 = new Label("Mascot",us);
        lb1.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        lb1.setTranslateX(10);
        lb1.setTranslateY(500);
        newPane.getChildren().addAll(lb1);

        // Create a scene and place it in the stage
        Scene scene = new Scene(rootPane,1000,650,Color.AQUA);
        rootPane.getChildren().addAll(pane,newPane);
        primaryStage.setTitle("java2s.com");
        primaryStage.setScene(scene); // Place in scene in the stage
        primaryStage.show();
    }
    public static void main(String[] args) {
        //creates new instance of mascot class and launches javafx
//        Mascot mascot= new Mascot();
//        launch(Mascot.class);
        launch(args);

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
