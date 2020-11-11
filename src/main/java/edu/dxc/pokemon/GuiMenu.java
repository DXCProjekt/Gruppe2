package edu.dxc.pokemon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class GuiMenu extends Application {

    private static GuiMenu instance = null;

    private Stage primaryStage = null;

    public GuiMenu() {
        instance = this;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../../../view/startScene.fxml"));
        primaryStage.setTitle("Pokemon");
        primaryStage.getIcons().add(new Image("file:src/main/java/edu/dxc/pokemon/pokeball.png"));
        primaryStage.setScene(new Scene(root, 720, 370));
        primaryStage.show();
    }

    /**
     * Die Methode switchToGame wechselt die Szene auf die Kampfansicht auf der primaryStage.
     */
    public void switchToGame() {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("../../../view/battleScene.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        primaryStage.setTitle("Pokemon");
        primaryStage.getIcons().add(new Image("file:src/main/java/edu/dxc/pokemon/pokeball.png"));
        primaryStage.setScene(new Scene(root, 720, 370));
        primaryStage.show();
    }

    public void switchToStart() {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("../../../view/startScene.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        primaryStage.setTitle("Pokemon");
        primaryStage.getIcons().add(new Image("file:src/main/java/edu/dxc/pokemon/pokeball.png"));
        primaryStage.setScene(new Scene(root, 720, 370));
        primaryStage.show();
    }

    public static GuiMenu getInstance() {
        if (instance == null) {
            instance = new GuiMenu();
        }

        return instance;
    }
}