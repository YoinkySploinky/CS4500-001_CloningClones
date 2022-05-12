package edu.umsl.CloningClonesV2.resources.com;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloController {

    @FXML

    private Circle clone70, clone71, clone72, clone73, clone74, clone75, clone76, clone77,
            clone60, clone61, clone62, clone63, clone64, clone65, clone66, clone67,
            clone50, clone51, clone52, clone53, clone54, clone55, clone56, clone57,
            clone40, clone41, clone42, clone43, clone44, clone45, clone46, clone47,
            clone30, clone31, clone32, clone33, clone34, clone35, clone36, clone37,
            clone20, clone21, clone22, clone23, clone24, clone25, clone26, clone27,
            clone10, clone11, clone12, clone13, clone14, clone15, clone16, clone17,
            clone00, clone01, clone02, clone03, clone04, clone05, clone06, clone07;

        public Label mascotText;
        public ImageView imageChange;
        public ImageView weightGraph;
        public TextField userInput;
        private String name;
        private long start;
        private long finish;

        String green = "0x7fff00ff";
        String blue = "0x1e90ffff";

        public void setName(String name){
            this.name = name;
        }
        public String getName() {
            return name;
        }

    public void clone70To7160(MouseEvent e) {
        if (blue.equals(String.valueOf(clone70.getFill()))) {
            if (green.equals(String.valueOf(clone71.getFill())) && green.equals(String.valueOf(clone60.getFill()))){
                clone70.setOpacity(0);
                clone70.setFill(Color.CHARTREUSE);
                clone71.setOpacity(1);
                clone71.setFill(Color.DODGERBLUE);
                clone60.setOpacity(1);
                clone60.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone60To6150(MouseEvent e) {
        if (blue.equals(String.valueOf(clone60.getFill()))) {
            if (green.equals(String.valueOf(clone61.getFill())) && green.equals(String.valueOf(clone50.getFill()))){
                clone60.setOpacity(0);
                clone60.setFill(Color.CHARTREUSE);
                clone61.setOpacity(1);
                clone61.setFill(Color.DODGERBLUE);
                clone50.setOpacity(1);
                clone50.setFill(Color.DODGERBLUE);
            }
        }
    }

    public void clone50To5140(MouseEvent e) {
        if (blue.equals(String.valueOf(clone50.getFill()))) {
            if (green.equals(String.valueOf(clone51.getFill())) && green.equals(String.valueOf(clone40.getFill()))) {
                clone50.setOpacity(0);
                clone50.setFill(Color.CHARTREUSE);
                clone51.setOpacity(1);
                clone51.setFill(Color.DODGERBLUE);
                clone40.setOpacity(1);
                clone40.setFill(Color.DODGERBLUE);
            }
        }
    }

    public void clone40To4130(MouseEvent e) {
        if (blue.equals(String.valueOf(clone40.getFill()))) {
            if (green.equals(String.valueOf(clone41.getFill())) && green.equals(String.valueOf(clone30.getFill()))) {
                clone40.setOpacity(0);
                clone40.setFill(Color.CHARTREUSE);
                clone41.setOpacity(1);
                clone41.setFill(Color.DODGERBLUE);
                clone30.setOpacity(1);
                clone30.setFill(Color.DODGERBLUE);
            }
        }
    }

    public void clone30To3120(MouseEvent e) {
        if (blue.equals(String.valueOf(clone30.getFill()))) {
            if (green.equals(String.valueOf(clone31.getFill())) && green.equals(String.valueOf(clone20.getFill()))) {
                clone30.setOpacity(0);
                clone30.setFill(Color.CHARTREUSE);
                clone31.setOpacity(1);
                clone31.setFill(Color.DODGERBLUE);
                clone20.setOpacity(1);
                clone20.setFill(Color.DODGERBLUE);
            }
        }
    }

    public void clone20To2110(MouseEvent e) {
        if (blue.equals(String.valueOf(clone20.getFill()))) {
            if (green.equals(String.valueOf(clone21.getFill())) && green.equals(String.valueOf(clone10.getFill()))) {
                clone20.setOpacity(0);
                clone20.setFill(Color.CHARTREUSE);
                clone21.setOpacity(1);
                clone21.setFill(Color.DODGERBLUE);
                clone10.setOpacity(1);
                clone10.setFill(Color.DODGERBLUE);
            }
        }
    }

    public void clone10To1100(MouseEvent e) {
        if (blue.equals(String.valueOf(clone10.getFill()))) {
            if (green.equals(String.valueOf(clone11.getFill())) && green.equals(String.valueOf(clone00.getFill()))) {
                clone10.setOpacity(0);
                clone10.setFill(Color.CHARTREUSE);
                clone11.setOpacity(1);
                clone11.setFill(Color.DODGERBLUE);
                clone00.setOpacity(1);
                clone00.setFill(Color.DODGERBLUE);
            }
        }
    }

    public void clone71To7261(MouseEvent e) {
        if (blue.equals(String.valueOf(clone71.getFill()))) {
            if (green.equals(String.valueOf(clone72.getFill())) && green.equals(String.valueOf(clone61.getFill()))){
                clone71.setOpacity(0);
                clone71.setFill(Color.CHARTREUSE);
                clone72.setOpacity(1);
                clone72.setFill(Color.DODGERBLUE);
                clone61.setOpacity(1);
                clone61.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone61To6251(MouseEvent e) {
        if (blue.equals(String.valueOf(clone61.getFill()))) {
            if (green.equals(String.valueOf(clone62.getFill())) && green.equals(String.valueOf(clone51.getFill()))){
                clone61.setOpacity(0);
                clone61.setFill(Color.CHARTREUSE);
                clone62.setOpacity(1);
                clone62.setFill(Color.DODGERBLUE);
                clone51.setOpacity(1);
                clone51.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone51To5241(MouseEvent e) {
        if (blue.equals(String.valueOf(clone51.getFill()))) {
            if (green.equals(String.valueOf(clone52.getFill())) && green.equals(String.valueOf(clone41.getFill()))){
                clone51.setOpacity(0);
                clone51.setFill(Color.CHARTREUSE);
                clone52.setOpacity(1);
                clone52.setFill(Color.DODGERBLUE);
                clone41.setOpacity(1);
                clone41.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone41To4231(MouseEvent e) {
        if (blue.equals(String.valueOf(clone41.getFill()))) {
            if (green.equals(String.valueOf(clone42.getFill())) && green.equals(String.valueOf(clone31.getFill()))){
                clone41.setOpacity(0);
                clone41.setFill(Color.CHARTREUSE);
                clone42.setOpacity(1);
                clone42.setFill(Color.DODGERBLUE);
                clone31.setOpacity(1);
                clone31.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone31To3221(MouseEvent e) {
        if (blue.equals(String.valueOf(clone31.getFill()))) {
            if (green.equals(String.valueOf(clone32.getFill())) && green.equals(String.valueOf(clone21.getFill()))){
                clone31.setOpacity(0);
                clone31.setFill(Color.CHARTREUSE);
                clone32.setOpacity(1);
                clone32.setFill(Color.DODGERBLUE);
                clone21.setOpacity(1);
                clone21.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone21To2211(MouseEvent e) {
        if (blue.equals(String.valueOf(clone21.getFill()))) {
            if (green.equals(String.valueOf(clone22.getFill())) && green.equals(String.valueOf(clone11.getFill()))){
                clone21.setOpacity(0);
                clone21.setFill(Color.CHARTREUSE);
                clone22.setOpacity(1);
                clone22.setFill(Color.DODGERBLUE);
                clone11.setOpacity(1);
                clone11.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone11To1201(MouseEvent e) {
        if (blue.equals(String.valueOf(clone11.getFill()))) {
            if (green.equals(String.valueOf(clone12.getFill())) && green.equals(String.valueOf(clone01.getFill()))){
                clone11.setOpacity(0);
                clone11.setFill(Color.CHARTREUSE);
                clone12.setOpacity(1);
                clone12.setFill(Color.DODGERBLUE);
                clone01.setOpacity(1);
                clone01.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone72To7362(MouseEvent e) {
        if (blue.equals(String.valueOf(clone72.getFill()))) {
            if (green.equals(String.valueOf(clone73.getFill())) && green.equals(String.valueOf(clone62.getFill()))){
                clone72.setOpacity(0);
                clone72.setFill(Color.CHARTREUSE);
                clone73.setOpacity(1);
                clone73.setFill(Color.DODGERBLUE);
                clone62.setOpacity(1);
                clone62.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone62To6352(MouseEvent e) {
        if (blue.equals(String.valueOf(clone62.getFill()))) {
            if (green.equals(String.valueOf(clone63.getFill())) && green.equals(String.valueOf(clone52.getFill()))){
                clone62.setOpacity(0);
                clone62.setFill(Color.CHARTREUSE);
                clone63.setOpacity(1);
                clone63.setFill(Color.DODGERBLUE);
                clone52.setOpacity(1);
                clone52.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone52To5342(MouseEvent e) {
        if (blue.equals(String.valueOf(clone52.getFill()))) {
            if (green.equals(String.valueOf(clone53.getFill())) && green.equals(String.valueOf(clone42.getFill()))){
                clone52.setOpacity(0);
                clone52.setFill(Color.CHARTREUSE);
                clone53.setOpacity(1);
                clone53.setFill(Color.DODGERBLUE);
                clone42.setOpacity(1);
                clone42.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone42To4332(MouseEvent e) {
        if (blue.equals(String.valueOf(clone42.getFill()))) {
            if (green.equals(String.valueOf(clone43.getFill())) && green.equals(String.valueOf(clone32.getFill()))){
                clone42.setOpacity(0);
                clone42.setFill(Color.CHARTREUSE);
                clone43.setOpacity(1);
                clone43.setFill(Color.DODGERBLUE);
                clone32.setOpacity(1);
                clone32.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone32To3322(MouseEvent e) {
        if (blue.equals(String.valueOf(clone32.getFill()))) {
            if (green.equals(String.valueOf(clone33.getFill())) && green.equals(String.valueOf(clone22.getFill()))){
                clone32.setOpacity(0);
                clone32.setFill(Color.CHARTREUSE);
                clone33.setOpacity(1);
                clone33.setFill(Color.DODGERBLUE);
                clone22.setOpacity(1);
                clone22.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone22To2312(MouseEvent e) {
        if (blue.equals(String.valueOf(clone22.getFill()))) {
            if (green.equals(String.valueOf(clone23.getFill())) && green.equals(String.valueOf(clone12.getFill()))){
                clone22.setOpacity(0);
                clone22.setFill(Color.CHARTREUSE);
                clone23.setOpacity(1);
                clone23.setFill(Color.DODGERBLUE);
                clone12.setOpacity(1);
                clone12.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone12To1302(MouseEvent e) {
        if (blue.equals(String.valueOf(clone12.getFill()))) {
            if (green.equals(String.valueOf(clone13.getFill())) && green.equals(String.valueOf(clone02.getFill()))){
                clone12.setOpacity(0);
                clone12.setFill(Color.CHARTREUSE);
                clone13.setOpacity(1);
                clone13.setFill(Color.DODGERBLUE);
                clone02.setOpacity(1);
                clone02.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone73To7463(MouseEvent e) {
        if (blue.equals(String.valueOf(clone73.getFill()))) {
            if (green.equals(String.valueOf(clone74.getFill())) && green.equals(String.valueOf(clone63.getFill()))){
                clone73.setOpacity(0);
                clone73.setFill(Color.CHARTREUSE);
                clone74.setOpacity(1);
                clone74.setFill(Color.DODGERBLUE);
                clone63.setOpacity(1);
                clone63.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone63To6453(MouseEvent e) {
        if (blue.equals(String.valueOf(clone63.getFill()))) {
            if (green.equals(String.valueOf(clone64.getFill())) && green.equals(String.valueOf(clone53.getFill()))){
                clone63.setOpacity(0);
                clone63.setFill(Color.CHARTREUSE);
                clone64.setOpacity(1);
                clone64.setFill(Color.DODGERBLUE);
                clone53.setOpacity(1);
                clone53.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone53To5443(MouseEvent e) {
        if (blue.equals(String.valueOf(clone53.getFill()))) {
            if (green.equals(String.valueOf(clone54.getFill())) && green.equals(String.valueOf(clone43.getFill()))){
                clone53.setOpacity(0);
                clone53.setFill(Color.CHARTREUSE);
                clone54.setOpacity(1);
                clone54.setFill(Color.DODGERBLUE);
                clone43.setOpacity(1);
                clone43.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone43To4433(MouseEvent e) {
        if (blue.equals(String.valueOf(clone43.getFill()))) {
            if (green.equals(String.valueOf(clone44.getFill())) && green.equals(String.valueOf(clone33.getFill()))){
                clone43.setOpacity(0);
                clone43.setFill(Color.CHARTREUSE);
                clone44.setOpacity(1);
                clone44.setFill(Color.DODGERBLUE);
                clone33.setOpacity(1);
                clone33.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone33To3423(MouseEvent e) {
        if (blue.equals(String.valueOf(clone33.getFill()))) {
            if (green.equals(String.valueOf(clone34.getFill())) && green.equals(String.valueOf(clone23.getFill()))){
                clone33.setOpacity(0);
                clone33.setFill(Color.CHARTREUSE);
                clone34.setOpacity(1);
                clone34.setFill(Color.DODGERBLUE);
                clone23.setOpacity(1);
                clone23.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone23To2413(MouseEvent e) {
        if (blue.equals(String.valueOf(clone23.getFill()))) {
            if (green.equals(String.valueOf(clone24.getFill())) && green.equals(String.valueOf(clone13.getFill()))){
                clone23.setOpacity(0);
                clone23.setFill(Color.CHARTREUSE);
                clone24.setOpacity(1);
                clone24.setFill(Color.DODGERBLUE);
                clone13.setOpacity(1);
                clone13.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone13To1403(MouseEvent e) {
        if (blue.equals(String.valueOf(clone13.getFill()))) {
            if (green.equals(String.valueOf(clone14.getFill())) && green.equals(String.valueOf(clone03.getFill()))){
                clone13.setOpacity(0);
                clone13.setFill(Color.CHARTREUSE);
                clone14.setOpacity(1);
                clone14.setFill(Color.DODGERBLUE);
                clone03.setOpacity(1);
                clone03.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone74To7564(MouseEvent e) {
        if (blue.equals(String.valueOf(clone74.getFill()))) {
            if (green.equals(String.valueOf(clone75.getFill())) && green.equals(String.valueOf(clone64.getFill()))){
                clone74.setOpacity(0);
                clone74.setFill(Color.CHARTREUSE);
                clone75.setOpacity(1);
                clone75.setFill(Color.DODGERBLUE);
                clone64.setOpacity(1);
                clone64.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone64To6554(MouseEvent e) {
        if (blue.equals(String.valueOf(clone64.getFill()))) {
            if (green.equals(String.valueOf(clone65.getFill())) && green.equals(String.valueOf(clone54.getFill()))){
                clone64.setOpacity(0);
                clone64.setFill(Color.CHARTREUSE);
                clone65.setOpacity(1);
                clone65.setFill(Color.DODGERBLUE);
                clone54.setOpacity(1);
                clone54.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone54To5544(MouseEvent e) {
        if (blue.equals(String.valueOf(clone54.getFill()))) {
            if (green.equals(String.valueOf(clone55.getFill())) && green.equals(String.valueOf(clone44.getFill()))){
                clone54.setOpacity(0);
                clone54.setFill(Color.CHARTREUSE);
                clone55.setOpacity(1);
                clone55.setFill(Color.DODGERBLUE);
                clone44.setOpacity(1);
                clone44.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone44To4534(MouseEvent e) {
        if (blue.equals(String.valueOf(clone44.getFill()))) {
            if (green.equals(String.valueOf(clone45.getFill())) && green.equals(String.valueOf(clone34.getFill()))){
                clone44.setOpacity(0);
                clone44.setFill(Color.CHARTREUSE);
                clone45.setOpacity(1);
                clone45.setFill(Color.DODGERBLUE);
                clone34.setOpacity(1);
                clone34.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone34To3524(MouseEvent e) {
        if (blue.equals(String.valueOf(clone34.getFill()))) {
            if (green.equals(String.valueOf(clone35.getFill())) && green.equals(String.valueOf(clone24.getFill()))){
                clone34.setOpacity(0);
                clone34.setFill(Color.CHARTREUSE);
                clone35.setOpacity(1);
                clone35.setFill(Color.DODGERBLUE);
                clone24.setOpacity(1);
                clone24.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone24To2514(MouseEvent e) {
        if (blue.equals(String.valueOf(clone24.getFill()))) {
            if (green.equals(String.valueOf(clone25.getFill())) && green.equals(String.valueOf(clone14.getFill()))){
                clone24.setOpacity(0);
                clone24.setFill(Color.CHARTREUSE);
                clone25.setOpacity(1);
                clone25.setFill(Color.DODGERBLUE);
                clone14.setOpacity(1);
                clone14.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone14To1504(MouseEvent e) {
        if (blue.equals(String.valueOf(clone14.getFill()))) {
            if (green.equals(String.valueOf(clone15.getFill())) && green.equals(String.valueOf(clone04.getFill()))){
                clone14.setOpacity(0);
                clone14.setFill(Color.CHARTREUSE);
                clone15.setOpacity(1);
                clone15.setFill(Color.DODGERBLUE);
                clone04.setOpacity(1);
                clone04.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone75To7665(MouseEvent e) {
        if (blue.equals(String.valueOf(clone75.getFill()))) {
            if (green.equals(String.valueOf(clone76.getFill())) && green.equals(String.valueOf(clone65.getFill()))){
                clone75.setOpacity(0);
                clone75.setFill(Color.CHARTREUSE);
                clone76.setOpacity(1);
                clone76.setFill(Color.DODGERBLUE);
                clone65.setOpacity(1);
                clone65.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone65To6655(MouseEvent e) {
        if (blue.equals(String.valueOf(clone65.getFill()))) {
            if (green.equals(String.valueOf(clone66.getFill())) && green.equals(String.valueOf(clone56.getFill()))){
                clone65.setOpacity(0);
                clone65.setFill(Color.CHARTREUSE);
                clone66.setOpacity(1);
                clone66.setFill(Color.DODGERBLUE);
                clone55.setOpacity(1);
                clone55.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone55To5645(MouseEvent e) {
        if (blue.equals(String.valueOf(clone55.getFill()))) {
            if (green.equals(String.valueOf(clone56.getFill())) && green.equals(String.valueOf(clone45.getFill()))){
                clone55.setOpacity(0);
                clone55.setFill(Color.CHARTREUSE);
                clone56.setOpacity(1);
                clone56.setFill(Color.DODGERBLUE);
                clone45.setOpacity(1);
                clone45.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone45To4635(MouseEvent e) {
        if (blue.equals(String.valueOf(clone45.getFill()))) {
            if (green.equals(String.valueOf(clone46.getFill())) && green.equals(String.valueOf(clone35.getFill()))){
                clone45.setOpacity(0);
                clone45.setFill(Color.CHARTREUSE);
                clone46.setOpacity(1);
                clone46.setFill(Color.DODGERBLUE);
                clone35.setOpacity(1);
                clone35.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone35To3625(MouseEvent e) {
        if (blue.equals(String.valueOf(clone35.getFill()))) {
            if (green.equals(String.valueOf(clone36.getFill())) && green.equals(String.valueOf(clone25.getFill()))){
                clone35.setOpacity(0);
                clone35.setFill(Color.CHARTREUSE);
                clone36.setOpacity(1);
                clone36.setFill(Color.DODGERBLUE);
                clone25.setOpacity(1);
                clone25.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone25To2615(MouseEvent e) {
        if (blue.equals(String.valueOf(clone25.getFill()))) {
            if (green.equals(String.valueOf(clone26.getFill())) && green.equals(String.valueOf(clone15.getFill()))){
                clone25.setOpacity(0);
                clone25.setFill(Color.CHARTREUSE);
                clone26.setOpacity(1);
                clone26.setFill(Color.DODGERBLUE);
                clone15.setOpacity(1);
                clone15.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone15To1605(MouseEvent e) {
        if (blue.equals(String.valueOf(clone15.getFill()))) {
            if (green.equals(String.valueOf(clone16.getFill())) && green.equals(String.valueOf(clone05.getFill()))) {
                clone15.setOpacity(0);
                clone15.setFill(Color.CHARTREUSE);
                clone16.setOpacity(1);
                clone16.setFill(Color.DODGERBLUE);
                clone05.setOpacity(1);
                clone05.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone76To7766(MouseEvent e){
        if (blue.equals(String.valueOf(clone76.getFill()))) {
            if (green.equals(String.valueOf(clone77.getFill())) && green.equals(String.valueOf(clone66.getFill()))) {
                clone76.setOpacity(0);
                clone76.setFill(Color.CHARTREUSE);
                clone77.setOpacity(1);
                clone77.setFill(Color.DODGERBLUE);
                clone66.setOpacity(1);
                clone66.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone66To6756(MouseEvent e){
        if (blue.equals(String.valueOf(clone66.getFill()))) {
            if (green.equals(String.valueOf(clone67.getFill())) && green.equals(String.valueOf(clone56.getFill()))) {
                clone66.setOpacity(0);
                clone66.setFill(Color.CHARTREUSE);
                clone67.setOpacity(1);
                clone67.setFill(Color.DODGERBLUE);
                clone56.setOpacity(1);
                clone56.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone56To5746(MouseEvent e){
        if (blue.equals(String.valueOf(clone56.getFill()))) {
            if (green.equals(String.valueOf(clone57.getFill())) && green.equals(String.valueOf(clone46.getFill()))) {
                clone56.setOpacity(0);
                clone56.setFill(Color.CHARTREUSE);
                clone57.setOpacity(1);
                clone57.setFill(Color.DODGERBLUE);
                clone46.setOpacity(1);
                clone46.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone46To4736(MouseEvent e){
        if (blue.equals(String.valueOf(clone46.getFill()))) {
            if (green.equals(String.valueOf(clone47.getFill())) && green.equals(String.valueOf(clone36.getFill()))) {
                clone46.setOpacity(0);
                clone46.setFill(Color.CHARTREUSE);
                clone47.setOpacity(1);
                clone47.setFill(Color.DODGERBLUE);
                clone36.setOpacity(1);
                clone36.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone36To3726(MouseEvent e){
        if (blue.equals(String.valueOf(clone36.getFill()))) {
            if (green.equals(String.valueOf(clone37.getFill())) && green.equals(String.valueOf(clone26.getFill()))) {
                clone36.setOpacity(0);
                clone36.setFill(Color.CHARTREUSE);
                clone37.setOpacity(1);
                clone37.setFill(Color.DODGERBLUE);
                clone26.setOpacity(1);
                clone26.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone26To2716(MouseEvent e){
        if (blue.equals(String.valueOf(clone26.getFill()))) {
            if (green.equals(String.valueOf(clone27.getFill())) && green.equals(String.valueOf(clone16.getFill()))) {
                clone26.setOpacity(0);
                clone26.setFill(Color.CHARTREUSE);
                clone27.setOpacity(1);
                clone27.setFill(Color.DODGERBLUE);
                clone16.setOpacity(1);
                clone16.setFill(Color.DODGERBLUE);
            }
        }
    }
    public void clone16To1706(MouseEvent e){
        if (blue.equals(String.valueOf(clone16.getFill()))) {
            if (green.equals(String.valueOf(clone17.getFill())) && green.equals(String.valueOf(clone06.getFill()))) {
                clone16.setOpacity(0);
                clone16.setFill(Color.CHARTREUSE);
                clone17.setOpacity(1);
                clone17.setFill(Color.DODGERBLUE);
                clone06.setOpacity(1);
                clone06.setFill(Color.DODGERBLUE);
            }
        }
    }

    public void giveUp(MouseEvent e) {
        mascotText.setText("You have given up! You FOOL! YOU ABSOLUTE BUFFON! YOU AREN'T THE CLOWN \n" +
                "BUT THE ENTIRE CIRCUS!");
        PauseTransition pause1 = new PauseTransition(Duration.seconds(10));
        pause1.setOnFinished(f -> mascotText.setText("Just kidding but Wow! That was harder than I thought! Let's look at why this game is so hard."));
        pause1.play();
        PauseTransition pause2 = new PauseTransition(Duration.seconds(15));
        pause2.setOnFinished(f -> mascotText.setText("Before I go into explaining, I should tell you that this game is actually impossible to win."));
        pause2.play();
        PauseTransition pause3 = new PauseTransition(Duration.seconds(20));
        pause3.setOnFinished(f -> mascotText.setText("\"But why, Snippy?!\""));
        pause3.play();
        PauseTransition pause4 = new PauseTransition(Duration.seconds(25));
        pause4.setOnFinished(f -> {
            mascotText.setText("I'm so glad you asked! Well, take a look at this graph.");
            weightGraph.setOpacity(1);

        });
        pause4.play();
        PauseTransition pause5 = new PauseTransition(Duration.seconds(30));
        pause5.setOnFinished(f -> mascotText.setText("The numbers you see in each box is the weight."));
        pause5.play();
        PauseTransition pause6 = new PauseTransition(Duration.seconds(35));
        pause6.setOnFinished(f -> mascotText.setText("Theoretically, if the sum of the weight of the boxes that make up the jail and the sum of all the other boxes are equal then it is possible to win."));
        pause6.play();
        PauseTransition pause7 = new PauseTransition(Duration.seconds(45));
        pause7.setOnFinished(f -> mascotText.setText("If we do a little math, then we find that the sum of the jail is 2 and that everything outside the jail will always be slightly less than 2."));
        pause7.play();
        PauseTransition pause8 = new PauseTransition(Duration.seconds(55));
        pause8.setOnFinished(f -> mascotText.setText("This means that the only way for the sums to be equal is if we had an infinite board, which is impossible in real life."));
        pause8.play();
        PauseTransition pause9 = new PauseTransition(Duration.seconds(65));
        pause9.setOnFinished(f -> {
            mascotText.setText("And this is why the game is impossible to win! Even though, you didn't win I hope you had just as much fun as I did!");
            imageChange.setFitWidth(105.0);
            imageChange.setFitHeight(100.0);
            imageChange.setImage(new Image(getClass().getResource("mascot3.PNG").toExternalForm()));
        });
        pause9.play();
        PauseTransition pause10 = new PauseTransition(Duration.seconds(75));
        pause10.setOnFinished(f -> mascotText.setText("Thanks for playing!"));
        pause10.play();


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        finish = System.currentTimeMillis();
        long timeElapsedMinutes = (((finish - start) / 1000) / 60);
        int timeElapsedSeconds = (int)(((finish - start) /1000) % 60);

        try {
            FileWriter log = new FileWriter("log.txt");
            log.write(dtf.format(now));
            log.write("\n");
            log.write(getName());
            log.write("\n");
            log.write("The amount of time spent playing Cloning Clones: " + timeElapsedMinutes + " minutes " + timeElapsedSeconds + " seconds");
            log.close();
        }
        catch (IOException err) {
            System.out.println("An error occurred.");
            err.printStackTrace();
        }

    }

    public void inputName(MouseEvent e){

        if(green.equals(String.valueOf(clone70.getFill())) && green.equals(String.valueOf(clone71.getFill())) && green.equals(String.valueOf(clone60.getFill()))) {
            String name = userInput.getText();

            mascotText.setText("Hello There, " + name +"! My name is Snippy! Welcome to Freeing the Clones!");
            PauseTransition pause1 = new PauseTransition(Duration.seconds(5));
            pause1.setOnFinished(f -> mascotText.setText("The goal is to get all of the circles, called clones, out of the jail, the three squares in the bottom left corner."));
            pause1.play();
            PauseTransition pause2 = new PauseTransition(Duration.seconds(10));
            pause2.setOnFinished(f -> mascotText.setText("Click on a clone to make your move. A move will consist of a clone creating a clone to the right and that clone moving up."));
            pause2.play();
            PauseTransition pause3 = new PauseTransition(Duration.seconds(20));
            pause3.setOnFinished(f -> {
                mascotText.setText("There are a few rules to go over before I can let you play.");
                imageChange.setImage(new Image(getClass().getResource("mascot3.PNG").toExternalForm()));
            });
            pause3.play();
            PauseTransition pause4 = new PauseTransition(Duration.seconds(25));
            pause4.setOnFinished(f -> mascotText.setText("First, you cannot move a clone if there is a clone above or to the right of your selected clone."));
            pause4.play();
            PauseTransition pause5 = new PauseTransition(Duration.seconds(30));
            pause5.setOnFinished(f -> mascotText.setText("Second, you cannot move a clone if the new clones will go outside of the board."));
            pause5.play();
            PauseTransition pause6 = new PauseTransition(Duration.seconds(35));
            pause6.setOnFinished(f -> mascotText.setText("There is a reset button at the top right of your screen. That will reset everything to its starting position."));
            pause6.play();
            PauseTransition pause7 = new PauseTransition(Duration.seconds(40));
            pause7.setOnFinished(f -> mascotText.setText("There is also a give up button. This button will allow you to give up and end the game."));
            pause7.play();
            PauseTransition pause8 = new PauseTransition(Duration.seconds(45));
            pause8.setOnFinished(f -> {
                mascotText.setText("That's it for the rules! Seems easy enough, right?");
                imageChange.setImage(new Image(getClass().getResource("mascot2.PNG").toExternalForm()));
            });
            pause8.play();
            PauseTransition pause9 = new PauseTransition(Duration.seconds(50));
            pause9.setOnFinished(f -> {
                mascotText.setText("Let's get started! Good Luck!");
                imageChange.setImage(new Image(getClass().getResource("mascot1.PNG").toExternalForm()));
            });
            pause9.play();
            PauseTransition pause10 = new PauseTransition(Duration.seconds(55));
            pause10.setOnFinished(f -> mascotText.setText(""));
            pause10.play();



            setName(name);

            start = System.currentTimeMillis();

            clone70.setFill(Color.DODGERBLUE);
            clone70.setOpacity(1);
            clone71.setFill(Color.DODGERBLUE);
            clone71.setOpacity(1);
            clone60.setFill(Color.DODGERBLUE);
            clone60.setOpacity(1);
        }

    }
    public void resetBoard(MouseEvent e){

        if(name != null) {
            clone60.setOpacity(1);
            clone60.setFill(Color.DODGERBLUE);
            clone70.setOpacity(1);
            clone70.setFill(Color.DODGERBLUE);
            clone71.setOpacity(1);
            clone71.setFill(Color.DODGERBLUE);
            clone00.setOpacity(0);
            clone00.setFill(Color.CHARTREUSE);
            clone10.setOpacity(0);
            clone10.setFill(Color.CHARTREUSE);
            clone20.setOpacity(0);
            clone20.setFill(Color.CHARTREUSE);
            clone30.setOpacity(0);
            clone30.setFill(Color.CHARTREUSE);
            clone40.setOpacity(0);
            clone40.setFill(Color.CHARTREUSE);
            clone50.setOpacity(0);
            clone50.setFill(Color.CHARTREUSE);
            clone01.setOpacity(0);
            clone01.setFill(Color.CHARTREUSE);
            clone11.setOpacity(0);
            clone11.setFill(Color.CHARTREUSE);
            clone21.setOpacity(0);
            clone21.setFill(Color.CHARTREUSE);
            clone31.setOpacity(0);
            clone31.setFill(Color.CHARTREUSE);
            clone41.setOpacity(0);
            clone41.setFill(Color.CHARTREUSE);
            clone51.setOpacity(0);
            clone51.setFill(Color.CHARTREUSE);
            clone61.setOpacity(0);
            clone61.setFill(Color.CHARTREUSE);
            clone02.setOpacity(0);
            clone02.setFill(Color.CHARTREUSE);
            clone12.setOpacity(0);
            clone12.setFill(Color.CHARTREUSE);
            clone22.setOpacity(0);
            clone22.setFill(Color.CHARTREUSE);
            clone32.setOpacity(0);
            clone32.setFill(Color.CHARTREUSE);
            clone42.setOpacity(0);
            clone42.setFill(Color.CHARTREUSE);
            clone52.setOpacity(0);
            clone52.setFill(Color.CHARTREUSE);
            clone62.setOpacity(0);
            clone62.setFill(Color.CHARTREUSE);
            clone72.setOpacity(0);
            clone72.setFill(Color.CHARTREUSE);
            clone03.setOpacity(0);
            clone03.setFill(Color.CHARTREUSE);
            clone13.setOpacity(0);
            clone13.setFill(Color.CHARTREUSE);
            clone23.setOpacity(0);
            clone23.setFill(Color.CHARTREUSE);
            clone33.setOpacity(0);
            clone33.setFill(Color.CHARTREUSE);
            clone43.setOpacity(0);
            clone43.setFill(Color.CHARTREUSE);
            clone53.setOpacity(0);
            clone53.setFill(Color.CHARTREUSE);
            clone63.setOpacity(0);
            clone63.setFill(Color.CHARTREUSE);
            clone73.setOpacity(0);
            clone73.setFill(Color.CHARTREUSE);
            clone04.setOpacity(0);
            clone04.setFill(Color.CHARTREUSE);
            clone14.setOpacity(0);
            clone14.setFill(Color.CHARTREUSE);
            clone24.setOpacity(0);
            clone24.setFill(Color.CHARTREUSE);
            clone34.setOpacity(0);
            clone34.setFill(Color.CHARTREUSE);
            clone44.setOpacity(0);
            clone44.setFill(Color.CHARTREUSE);
            clone54.setOpacity(0);
            clone54.setFill(Color.CHARTREUSE);
            clone64.setOpacity(0);
            clone64.setFill(Color.CHARTREUSE);
            clone74.setOpacity(0);
            clone74.setFill(Color.CHARTREUSE);
            clone05.setOpacity(0);
            clone05.setFill(Color.CHARTREUSE);
            clone15.setOpacity(0);
            clone15.setFill(Color.CHARTREUSE);
            clone25.setOpacity(0);
            clone25.setFill(Color.CHARTREUSE);
            clone35.setOpacity(0);
            clone35.setFill(Color.CHARTREUSE);
            clone45.setOpacity(0);
            clone45.setFill(Color.CHARTREUSE);
            clone55.setOpacity(0);
            clone55.setFill(Color.CHARTREUSE);
            clone65.setOpacity(0);
            clone65.setFill(Color.CHARTREUSE);
            clone75.setOpacity(0);
            clone75.setFill(Color.CHARTREUSE);
            clone06.setOpacity(0);
            clone06.setFill(Color.CHARTREUSE);
            clone16.setOpacity(0);
            clone16.setFill(Color.CHARTREUSE);
            clone26.setOpacity(0);
            clone26.setFill(Color.CHARTREUSE);
            clone36.setOpacity(0);
            clone36.setFill(Color.CHARTREUSE);
            clone46.setOpacity(0);
            clone46.setFill(Color.CHARTREUSE);
            clone56.setOpacity(0);
            clone56.setFill(Color.CHARTREUSE);
            clone66.setOpacity(0);
            clone66.setFill(Color.CHARTREUSE);
            clone76.setOpacity(0);
            clone76.setFill(Color.CHARTREUSE);
            clone07.setOpacity(0);
            clone07.setFill(Color.CHARTREUSE);
            clone17.setOpacity(0);
            clone17.setFill(Color.CHARTREUSE);
            clone27.setOpacity(0);
            clone27.setFill(Color.CHARTREUSE);
            clone37.setOpacity(0);
            clone37.setFill(Color.CHARTREUSE);
            clone47.setOpacity(0);
            clone47.setFill(Color.CHARTREUSE);
            clone57.setOpacity(0);
            clone57.setFill(Color.CHARTREUSE);
            clone67.setOpacity(0);
            clone67.setFill(Color.CHARTREUSE);
            clone77.setOpacity(0);
            clone77.setFill(Color.CHARTREUSE);
        }
    }
}

