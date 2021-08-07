package org.nick.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
    @FXML
    private void close(Event event) throws IOException {
        event.consume(); //чтобы при нажатии на крест основное окно не закрывалось
        FXMLLoader loader = new FXMLLoader(Game.class.getResource("/view/exitApprove.fxml"));
        Stage stage = loader.load();
        stage.initModality(Modality.APPLICATION_MODAL); //оставляем активным только это окно
        stage.show();
    }
}
