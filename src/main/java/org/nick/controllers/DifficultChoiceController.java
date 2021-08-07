package org.nick.controllers;

import javafx.fxml.FXML;
import org.nick.model.Board;

import java.io.IOException;

public class DifficultChoiceController {

    @FXML
    private void easy() throws IOException {
        Board.beginEasyGame();
        Game.setContent("/view/mainGame.fxml");
    }

    @FXML
    private void normal() throws IOException {
        Board.beginNormalGame();
        Game.setContent("/view/mainGame.fxml");
    }

    @FXML
    private void hard() throws IOException {
        Board.beginHardGame();
        Game.setContent("/view/mainGame.fxml");
    }

    @FXML
    private void veryHard() throws IOException {
        Board.beginVeryHardGame();
        Game.setContent("/view/mainGame.fxml");
    }
}
