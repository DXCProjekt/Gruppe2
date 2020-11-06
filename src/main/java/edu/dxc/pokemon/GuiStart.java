package edu.dxc.pokemon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuiStart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../../view/battleScene.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 720, 370));
        primaryStage.show();
    }
}
