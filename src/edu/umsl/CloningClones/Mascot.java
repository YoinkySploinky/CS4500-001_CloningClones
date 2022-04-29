package edu.umsl.CloningClones;
import java.util.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class Mascot extends Application {
    @Override
    public void start (Stage primaryStage) {
        ImageView us = new ImageView(new Image("./pictures/mascot1.png"));
        Label lb1 = new Label("Mascot", us);
        lb1.setStyle("-fx-border-color: green; -fx-border-width: 2");
        lb1.setContentDisplay(ContentDisplay.BOTTOM);
        lb1.setTextFill(Color.RED);

        HBox pane = new HBox(20);
        pane.getChildren().addAll(lb1);

        Scene scene = new Scene(pane, 450,150);
        primaryStage.setTitle("Testing Pictures");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}