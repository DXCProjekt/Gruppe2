package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

public class BattleController {

    @FXML
    Button btnFight, btnBag, btnPokemon, btnRun;
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
    }

    public void btnBagClicked() {
        System.out.println("btnBagClicked!");
        tvFightText.setText("btnBagClicked!");
        tvPokemonLeft.setText("btnBagClicked!");
        tvPokemonRight.setText("btnBagClicked!");
    }

    public void btnPokemonClicked() {
        System.out.println("btnPokemonClicked!");
        tvFightText.setText("btnPokemonClicked!");
        tvPokemonLeft.setText("btnPokemonClicked!");
        tvPokemonRight.setText("btnPokemonClicked!");
    }

    public void btnRunClicked() {
        System.out.println("btnRunClicked!");
        tvFightText.setText("btnRunClicked!");
        tvPokemonLeft.setText("btnRunClicked!");
        tvPokemonRight.setText("btnRunClicked!");
    }



}
