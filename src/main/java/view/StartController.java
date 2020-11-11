package view;

import edu.dxc.pokemon.GuiMenu;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartController {

    @FXML
    Button btnStart, btnBeenden;

    public void btnStartClicked() {
        GuiMenu.getInstance().switchToGame();
    }

    public void btnBeendenClicked() {
        Stage stage = (Stage) btnBeenden.getScene().getWindow();
        stage.close();
    }

}
