package edu.dxc.pokemon;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class FightTest extends TestCase {

    public void testStartRound() {
        Fight fight = new Fight();

        Pokemon p1 = new Pokemon("Glumanda", "Feuer", 150, 30, 10, 65, "file:resources/pokemon/charmanderBack.png", "file:resources/pokemon/charmanderFront.png", "Kratzer", "Glut","Feuerzahn", "Feuersturm");
        Pokemon p2 = new Pokemon("Schiggy", "Wasser", 200,  20, 20, 43, "file:resources/pokemon/squirtleBack.png", "file:resources/pokemon/squirtleFront.png", "Kratzer", "Aquaknarre", "Aquawelle", "Hydropumpe");

        fight.oppoPokemon = p2;
        fight.myPokemon = p1;
        fight.startRound(p1.getAttack1());
        Assertions.assertTrue(fight.firstMove.getMovingPokemon().equals(p1), "Fehler: Die Initiative wird nicht korrekt berrechnet.");
    }
}