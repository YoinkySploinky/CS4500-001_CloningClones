package edu.umsl.CloningClones;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Mascot {
    String playPhrase[] = new String[10];

    public String[] getPlayPhrase() {
        playPhrase[0]="";
        playPhrase[1]="";
        playPhrase[2]="";
        playPhrase[3]="";
        playPhrase[4]="";
        playPhrase[5]="";
        playPhrase[6]="";
        playPhrase[7]="";
        playPhrase[8]="";
        playPhrase[9]="";
        return playPhrase;
    }
}