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
    private String startingRules[] = new  String[11];
    private String playPhrase[] = new String[10];
    private String endingExplain[]=new String[10];

    //everything for the start before the player gets to play
    public String[] getStartingRules(){
        startingRules[0]="Hello There! My name is Snippy! Welcome to Freeing the Clones!";
        startingRules[1]="The goal is to get all of the circles, called clones, out of the jail.";
        startingRules[2]="Click on a clone to make your move. This is what a move will look like.";
        startingRules[3]="There are a few rules to go over before I can let you play.";
        startingRules[4]="First, you cannot move a clone is there is a clone above or to the left of your selected clone.";
        startingRules[5]="Second, you cannot move a clone if the new clones will go outside of the board.";
        startingRules[6]="There is a reset button at the top right of your screen. That will reset everything to its starting position.";
        startingRules[7]="Once you reset the board 3 times, a new button will appear.";
        startingRules[8]="This new botton will allow you to give up and end the game";
        startingRules[9]="That's it for the rules! Seems easy enough, right?";
        startingRules[10]="Let's get started! Good Luck!";
        return startingRules;
    }

    //phrases for while the player plays the game
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

    //explaination for the end after the player gives up
    public String[] getEndingExplain() {
        endingExplain[0]="Wow! That was harder than I thought! Let's look at why this game is so hard.";
        endingExplain[1]="Before I go into explaining, I should tell you that this game is actually impossible to win.";
        endingExplain[2]="But why, Snippy?!";
        endingExplain[3]="I'm so glad you asked! Well, take a look at this graph."; //show weight graph
        endingExplain[4]="The numbers you see in each box is the weight.";
        endingExplain[5]="Theoretically, if the sum of the weight of the boxes that make up the jail and the sum of all the other boxes are equal then it is possible to win.";
        endingExplain[6]="If we do a little math, then we find that the sum of the jail is 2 and that everything outside the jail will always be slightly less than 2.";
        endingExplain[7]="This means that the only way for the sums to be equal is if we had an infinite board, which is impossible in real life.";
        endingExplain[8]="And this is why the game is impossible to win! Even though, you didn't win I hope you had just as much fun as I did!";
        endingExplain[9]="Thanks for playing!";
        return endingExplain;
    }
}