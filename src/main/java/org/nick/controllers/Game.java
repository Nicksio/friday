package org.nick.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Game extends Application {

    private static VBox contentWindow;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Game.class.getResource("/view/mainWindow.fxml"));
        stage = loader.load();
        stage.show();

        contentWindow = (VBox) stage.getScene().getRoot();

        setContent("/view/startWindow.fxml");
    }

    public static VBox getContentWindow() {
        return contentWindow;
    }

    public static void setContent(String viewResource) throws IOException {
        var vBoxList = contentWindow.getChildren();
        while (vBoxList.size() > 1) vBoxList.remove(1); //если имеется любое наполнение главного окна, помимо MenuBar,
                                                            //то очищаем для последующего наполнения, оставляя только MenuBar
        FXMLLoader loader = new FXMLLoader(Game.class.getResource(viewResource));
        Parent content = loader.load();
        contentWindow.getChildren().add(content);
    }

    public static void main(String[] args) {
        launch();
    }
}