package org.nick.controllers;

import javafx.fxml.FXML;


import java.io.IOException;

public class StartWindowController {

    @FXML
    private void start() throws IOException {
        Game.setContent("/view/difficultChoice.fxml");

    }
}
