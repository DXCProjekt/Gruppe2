package view;

import edu.dxc.pokemon.Fight;
import edu.dxc.pokemon.GuiMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BattleController {

    public Fight fight = new Fight();

    @FXML
    Button btnFight, btnBag, btnPokemon, btnRun, btnAttack1, btnAttack2, btnAttack3, btnAttack4, btnBack;
    @FXML
    Label tvPokemonLeft, tvPokemonRight;
    @FXML
    TextArea tvFightText;
    @FXML
    ImageView ivPokemonFront, ivPokemonBack;
    @FXML
    ProgressBar barLeft, barRight;

    @FXML
    public void initialize() {
        tvPokemonLeft.setText(fight.myPokemon.getName());
        tvPokemonRight.setText(fight.oppoPokemon.getName());
        ivPokemonFront.setImage(new Image(fight.myPokemon.getSprite()));
        ivPokemonBack.setImage(new Image(fight.oppoPokemon.getBackSprite()));
        barLeft.setProgress(1);
        barRight.setProgress(1);
        tvFightText.setText("Ich werde gewinnen! \nDenn ich glaube an das Herz der Karten!! \nLET IT RIP!!!");
    }

    public void checkVictory() {
        boolean victory = fight.myPokemon.isAlive();

        if (victory) {
            tvFightText.setText("Gewonnen!");
        } else {
            tvFightText.setText("Verloren");
        }

        btnRun.setVisible(true);
        btnBack.setVisible(false);
        btnAttack4.setVisible(false);
        btnAttack3.setVisible(false);
        btnAttack2.setVisible(false);
        btnAttack1.setVisible(false);

        btnAttack1.setDisable(false);
        btnAttack2.setDisable(false);
        btnAttack3.setDisable(false);
        btnAttack4.setDisable(false);

    }

    public void updateHp() {
        double left = (Double.parseDouble(""+fight.myPokemon.getCurrHp())) / (Double.parseDouble(""+fight.myPokemon.getMaxHp()));
        System.out.println(left);
        double right = (Double.parseDouble(""+fight.oppoPokemon.getCurrHp())) / (Double.parseDouble(""+fight.oppoPokemon.getMaxHp()));
        System.out.println(right);


        barLeft.setProgress(left);
        barRight.setProgress(right);
    }

    public void btnFightClicked() {
        // Demo content
        System.out.println("btnFightClicked!");

        // Show Attack Buttons
        btnFight.setVisible(false);
        btnBag.setVisible(false);
        btnPokemon.setVisible(false);
        btnRun.setVisible(false);

        btnAttack1.setVisible(true);
        btnAttack2.setVisible(true);
        btnAttack3.setVisible(true);
        btnAttack4.setVisible(true);
        btnBack.setVisible(true);

        // Logic
        btnAttack1.setText(fight.myPokemon.getAttack1().getName());
        btnAttack2.setText(fight.myPokemon.getAttack2().getName());
        btnAttack3.setText(fight.myPokemon.getAttack3().getName());
        btnAttack4.setText(fight.myPokemon.getAttack4().getName());
    }

    public void btnBagClicked() {
        System.out.println("btnBagClicked!");

    }

    public void btnPokemonClicked() {
        System.out.println("btnPokemonClicked!");

    }

    public void btnRunClicked() {
        GuiMenu.getInstance().switchToStart();
        System.out.println("Test");
    }

    public void btnAttack1(ActionEvent actionEvent) {
        System.out.println("btnAttack1 Test");
        boolean end = fight.startRound(fight.myPokemon.getAttack1());
        tvFightText.setText(fight.battleText);
        updateHp();

        if (!end) {
            checkVictory();
        }
    }

    public void btnAttack2(ActionEvent actionEvent) {
        System.out.println("btnAttack2 Test");
        boolean end = fight.startRound(fight.myPokemon.getAttack2());
        tvFightText.setText(fight.battleText);
        updateHp();

        if (!end) {
            checkVictory();
        }
    }

    public void btnAttack3(ActionEvent actionEvent) {
        System.out.println("btnAttack3 Test");
        boolean end = fight.startRound(fight.myPokemon.getAttack3());
        tvFightText.setText(fight.battleText);
        updateHp();

        if (!end) {
            checkVictory();
        }
    }

    public void btnAttack4(ActionEvent actionEvent) {
        System.out.println("btnAttack4 Test");
        boolean end = fight.startRound(fight.myPokemon.getAttack4());
        tvFightText.setText(fight.battleText);
        updateHp();

        if (!end) {
            checkVictory();
        }
    }

    public void btnback(ActionEvent actionEvent) {
        // Hide Attack Buttons
        btnFight.setVisible(true);
        btnBag.setVisible(true);
        btnPokemon.setVisible(true);
        btnRun.setVisible(true);

        btnAttack1.setVisible(false);
        btnAttack2.setVisible(false);
        btnAttack3.setVisible(false);
        btnAttack4.setVisible(false);
        btnBack.setVisible(false);
    }

}
