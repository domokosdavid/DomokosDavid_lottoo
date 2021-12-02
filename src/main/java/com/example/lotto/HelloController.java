package com.example.lotto;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class HelloController {
    @FXML
    private Label labelRandom;
    @FXML
    private Label labelLottoSzamok;
    @FXML
    private Button btnSorsol;
    @FXML
    static Random random = new Random();
    @FXML
    public ArrayList<Integer> sorsoltak = new ArrayList<>();



    int r = 0;



    public void randomSorsol(ActionEvent actionEvent) throws InterruptedException {
        boolean ossz = sorsoltak.size() < 5;
        if (ossz){
            TimeUnit.SECONDS.sleep(2);
            r = random.nextInt(90);
            labelRandom.setText(String.valueOf(r));
            sorsoltak.add(r);
            labelLottoSzamok.setText(feltoltes());
            if (sorsoltak.size() == 5){
                btnSorsol.setText("Rendez");
            }


        }
        else {

            labelLottoSzamok.setText(feltoltes());
            btnSorsol.setText("Sorsol");
            sorsoltak.clear();
        }

    }
    private String feltoltes(){
        String feltoltottSzoveg = "";
        for (int num : sorsoltak){
            feltoltottSzoveg += String.valueOf(num) + " ";
        }
        return feltoltottSzoveg;
    }
}