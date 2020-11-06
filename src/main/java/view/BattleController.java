package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

public class BattleController {

    @FXML
    Button btnFight, btnBag, btnPokemon, btnRun;
    Label tvFightText, tvPokemonLeft, tvPokemonRight;
    ImageView ivPokemonFront, ivPokemonBack;
    ProgressBar barLeft, barRight;

    public void btnFightClicked() {
        System.out.println("btnFightClicked!");
        tvSetText();
    }

    public void btnBagClicked() {
        System.out.println("btnBagClicked!");
    }

    public void btnPokemonClicked() {
        System.out.println("btnPokemonClicked!");
    }

    public void btnRunClicked() {
        System.out.println("btnRunClicked!");
    }

    public void tvSetText() {
        tvFightText.setText("Test");
    }

}
