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
            private ArrayList<Integer> sorsoltak = new ArrayList<>();



    int count = 0;
    int r = 0;
    int r2 = 0;
    int r3 = 0;
    int r4 = 0;
    int r5 = 0;

    public void randomSorsol(ActionEvent actionEvent) throws InterruptedException {
        boolean ossz = sorsoltak.size() < 5;
        

    }
}