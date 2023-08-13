package com.myprojects.tic_tac_toe;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BoardController {
    @FXML
    private Button box00;
    @FXML
    private Button box01;
    @FXML
    private Button box02;
    @FXML
    private Button box10;
    @FXML
    private Button box11;
    @FXML
    private Button box12;
    @FXML
    private Button box20;
    @FXML
    private Button box21;
    @FXML
    private Button box22;

    private static int playCount = 0;

    private static char[][] boardMatrix = new char[3][3];

    @FXML
    protected void playAction(Event event) {
        Button button = (Button)event.getSource();

        if(playCount % 2 == 0){
            button.setText("X");
            manageMatrix(button.getId(), 0);

        }
        else {
            button.setText("O");
            manageMatrix(button.getId(), 1);
        }
        playCount++;

        if(playCount > 2){
            checkWinCondition();
        }
    }

    protected boolean checkWinCondition(int[][] winVector){
        String testString = "";
        boolean hasWon() = true;
        for(int rowIndex = 0; rowIndex < 3; rowIndex++ ){

        }
        return hasWon;
    }

    protected boolean stringCheck(String testString){
        if(testString == "XXX" || testString == "OOO"){
            return true;
        }
        return false;
    }
    
    protected void manageMatrix(String id, int value){
          int row = (int) id.charAt(3);
          int column = (int) id.charAt(4);

          if(value == 0) boardMatrix[row][column] = 'X';
          else boardMatrix[row][column] = 'O';
    }
}