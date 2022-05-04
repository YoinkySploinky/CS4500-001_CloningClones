package edu.umsl.CloningClones;
import java.util.*;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Main extends Application{

    static ErrorChecking error = new ErrorChecking();
    Mascot mascot= new Mascot();
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
    public void start (Stage primaryStage) throws InterruptedException {
        StackPane rootPane = new StackPane();
        // Create a GridPane
        FlowPane subRootPane = new FlowPane();
        subRootPane.setHgap(5);
        subRootPane.setStyle("-fx-background-color: AQUA");
        GridPane pane = new GridPane();
        Scanner input = new Scanner(System.in);

        // creating board
        int count = 0;
        double s = 80;// side of rectangle
        //board is always going to be 8 by 8
        int z = 8;
//        if (z%2 == 0){ //only works for even numbers
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
//        }
//        else { //only works for odd numbers
//            for (int i = 0; i < z; i++) {
//                for (int j = 0; j < z; j++) {
//                    Rectangle r = new Rectangle(s, s, s, s);
//                    if (count % 2 == 0) {
//                        r.setFill(Color.WHITE);
//                    }
//                    pane.add(r, j, i);
//                    count++;
//                }
//            }
//        }



        // adds clones to the board that should properly scale based on *s*
        for (int i = 0; i < z; i++) {
            for(int j = 0; j < z; j++) {
                Circle clone = new Circle(s/2, Color.CHARTREUSE);
                clone.setOpacity(0);
                if (i == z - 1 && j == 0) {
                    clone.setOpacity(1);
                    pane.add(clone, j, i);
                }
                else if (i == z - 2 && j == 0) {
                    clone.setOpacity(1);
                    pane.add(clone, j, i);
                }
                else if (i == z - 1 && j == 1) {
                    clone.setOpacity(1);
                    pane.add(clone, j, i);
                }
                else {
                    pane.add(clone,j, i);
                }
            }
        }

//        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent e) {
//                System.out.println("Hello World");
//                clone.setFill(Color.DARKSLATEBLUE);
//            }
//        };
//        //Registering the event filter
//        clone.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        HBox newPane = new HBox();//mascot
        ImageView us = new ImageView(new Image("./pictures/mascot1.png"));
        us.setFitHeight(100);
        us.setFitWidth(100);
        us.setPreserveRatio(true);
        Label lb1 = new Label("Mascot",us);
        lb1.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        lb1.setTranslateX(10);
        lb1.setTranslateY(500);
//        Rectangle speachBubble = new Rectangle(10, 10, 100, 100);
//        speachBubble.setFill(Color.BEIGE);
        //mascot speaking (below)
        Label mascotSay = new Label("Hello There! This is how I speak! Blah Blah how will this text wrap test test test test test");
        mascotSay.setContentDisplay(ContentDisplay.CENTER);
        mascotSay.setTranslateX(5);
        mascotSay.setTranslateY(450);
        mascotSay.setMaxWidth(250);
        mascotSay.setWrapText(true);
        newPane.getChildren().addAll(lb1,mascotSay);

        // Create a scene and place it in the stage
        Scene scene = new Scene(rootPane,1000,650,Color.AQUA);
        rootPane.getChildren().addAll(subRootPane);
        subRootPane.getChildren().addAll(pane,newPane);
        primaryStage.setTitle("Freeing the Clones");
        primaryStage.setScene(scene); // Place in scene in the stage
        primaryStage.show();

    }
    public static void main(String[] args) {
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
