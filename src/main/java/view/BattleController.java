package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BattleController {

    @FXML
    Button btnFight;

    public void onButtonClick() {
        System.out.println("Button clicked!");
    }

}
