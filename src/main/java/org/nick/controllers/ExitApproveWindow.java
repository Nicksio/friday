package org.nick.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ExitApproveWindow {
    @FXML private Stage exitApprove;

    @FXML
    private void exit(){
        Platform.exit();
    }

    @FXML
    private void cancelExit(){
        exitApprove.close();
    }
}
