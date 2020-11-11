package edu.dxc.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokemonTest {

    @Test
    public void testCalculateAttack() {

    }

    @Test
    public void testCalculateRandomAttack() {
        Pokemon testpokemon1 = new Pokemon("Testpokemon 1", "Feuer", 150, 30, 10, 65, "file:resources/pokemon/charmanderBack.png", "file:resources/pokemon/charmanderFront.png", "Kratzer", "Glut","Feuerzahn", "Feuersturm");
        Pokemon testpokemon2 = new Pokemon("Testpokemon 2", "Feuer", 150, 30, 10, 65, "file:resources/pokemon/charmanderBack.png", "file:resources/pokemon/charmanderFront.png", "Kratzer", "Glut","Feuerzahn", "Feuersturm");

        Assertions.assertTrue(testpokemon1.calculateRandomAttack(testpokemon2) instanceof AttackMove, "Fehler: CalculatePokemonAttack liefert für das Pokemon keinen AttackMove zurück.");
    }
}