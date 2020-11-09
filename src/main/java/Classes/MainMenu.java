package Classes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainMenu extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("Pokemon");

        ImageView ivBackground = new ImageView();
        ivBackground.setImage(new Image("file:resources/background.png"));
        ivBackground.setFitHeight(600);
        ivBackground.setFitWidth(800);
        ivBackground.setCache(true);

        ImageView ivLogo = new ImageView();
        ivLogo.setImage(new Image("file:resources/pokemon_logo.png"));
        ivLogo.setFitWidth(450);
        ivLogo.setFitHeight(160);
        ivLogo.setX(175);
        ivLogo.setY(50);
        ivLogo.setCache(true);

        ImageView ivGlumanda = new ImageView();
        ivGlumanda.setImage(new Image("File:resources/charmander.png"));
        ivGlumanda.setFitHeight(64);
        ivGlumanda.setFitWidth(64);
        ivGlumanda.setX(320);
        ivGlumanda.setY(420);
        ivGlumanda.setCache(true);

        ImageView ivBisasam = new ImageView();
        ivBisasam.setImage(new Image("File:resources/bulbasaur.png"));
        ivBisasam.setFitHeight(64);
        ivBisasam.setFitWidth(64);
        ivBisasam.setX(375);
        ivBisasam.setY(425);
        ivBisasam.setCache(true);

        ImageView ivSchiggy = new ImageView();
        ivSchiggy.setImage(new Image("File:resources/squirtle.png"));
        ivSchiggy.setFitHeight(64);
        ivSchiggy.setFitWidth(64);
        ivSchiggy.setX(420);
        ivSchiggy.setY(420);
        ivSchiggy.setCache(true);

        Button buttonContinue = new Button();
        buttonContinue.setText("Weiter");
        buttonContinue.setPrefHeight(50);
        buttonContinue.setPrefWidth(200);
        buttonContinue.setLayoutX(30);
        buttonContinue.setLayoutY(520);
        buttonContinue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println("WEITER");

            }
        });

        Button buttonNewGame = new Button();
        buttonNewGame.setText("Neues Spiel");
        buttonNewGame.setPrefHeight(50);
        buttonNewGame.setPrefWidth(200);
        buttonNewGame.setLayoutX(300);
        buttonNewGame.setLayoutY(520);
        buttonNewGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println("NEUES SPIEL");

            }
        });

        Button buttonExit = new Button();
        buttonExit.setText("Beenden");
        buttonExit.setPrefHeight(50);
        buttonExit.setPrefWidth(200);
        buttonExit.setLayoutX(570);
        buttonExit.setLayoutY(520);
        buttonExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println("BEENDEN");
                stage.close();

            }
        });

        AnchorPane root = new AnchorPane();
        root.getChildren().add(ivBackground);
        root.getChildren().add(ivLogo);
        root.getChildren().add(ivGlumanda);
        root.getChildren().add(ivBisasam);
        root.getChildren().add(ivSchiggy);
        root.getChildren().add(buttonContinue);
        root.getChildren().add(buttonNewGame);
        root.getChildren().add(buttonExit);

        stage.setScene(new Scene(root, 800, 600));
        stage.setResizable(false);
        stage.show();

    }

}
