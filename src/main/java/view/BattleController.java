package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BattleController {

    @FXML
    Button btnFight, btnBag, btnPokemon, btnRun, btnAttack1, btnAttack2, btnAttack3, btnAttack4;
    @FXML
    Label tvFightText, tvPokemonLeft, tvPokemonRight;
    @FXML
    ImageView ivPokemonFront, ivPokemonBack;
    @FXML
    ProgressBar barLeft, barRight;

    public void btnFightClicked() {
        System.out.println("btnFightClicked!");
        tvFightText.setText("btnFightClicked!");
        tvPokemonLeft.setText("btnFightClicked!");
        tvPokemonRight.setText("btnFightClicked!");
        barLeft.setProgress(0.7);
        barRight.setProgress(0.7);
        ivPokemonFront.setImage(new Image("file:resources/scene/pokemonBack.png"));
        ivPokemonBack.setImage(new Image("file:resources/scene/pokemonFront.png"));
    }

    public void btnBagClicked() {
        System.out.println("btnBagClicked!");
        tvFightText.setText("btnBagClicked!");
        tvPokemonLeft.setText("btnBagClicked!");
        tvPokemonRight.setText("btnBagClicked!");
        barLeft.setProgress(0.5);
        barRight.setProgress(0.5);
        ivPokemonFront.setImage(new Image("file:resources/scene/pokemonFront.png"));
        ivPokemonBack.setImage(new Image("file:resources/scene/pokemonBack.png"));
    }

    public void btnPokemonClicked() {
        System.out.println("btnPokemonClicked!");
        tvFightText.setText("btnPokemonClicked!");
        tvPokemonLeft.setText("btnPokemonClicked!");
        tvPokemonRight.setText("btnPokemonClicked!");
        barLeft.setProgress(0.3);
        barRight.setProgress(0.3);
        ivPokemonFront.setImage(new Image("file:resources/scene/pokemonBack.png"));
        ivPokemonBack.setImage(new Image("file:resources/scene/pokemonFront.png"));
    }

    public void btnRunClicked() {
        System.out.println("btnRunClicked!");
        tvFightText.setText("btnRunClicked!");
        tvPokemonLeft.setText("btnRunClicked!");
        tvPokemonRight.setText("btnRunClicked!");
        barLeft.setProgress(0.1);
        barRight.setProgress(0.1);
        ivPokemonFront.setImage(new Image("file:resources/scene/pokemonFront.png"));
        ivPokemonBack.setImage(new Image("file:resources/scene/pokemonBack.png"));
    }


    public void btnAttack1(ActionEvent actionEvent) {

    }

    public void btnAttack2(ActionEvent actionEvent) {

    }

    public void btnAttack3(ActionEvent actionEvent) {

    }

    public void btnAttack4(ActionEvent actionEvent) {

    }
}
