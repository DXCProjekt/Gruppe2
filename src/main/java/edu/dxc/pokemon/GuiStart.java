package edu.dxc.pokemon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.BattleController;

public class GuiStart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../../view/battleScene.fxml"));
        primaryStage.setTitle("Pokémon");
        // primaryStage.getIcons().add(new Image("file:pokeball.png"));
        primaryStage.setScene(new Scene(root, 720, 370));
        primaryStage.show();
    }
}
