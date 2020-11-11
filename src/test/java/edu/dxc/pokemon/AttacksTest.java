package edu.dxc.pokemon;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class AttacksTest extends TestCase {

    public void testGiveAttack() {
        Attacks attack = Attacks.getInstance();
        Assertions.assertTrue(Attacks.getInstance().giveAttack("Hallo Erik") instanceof Attack, "Fehler: Methode giveAttack gibt keine Attacke zurück");
    }

    public void testGiveAttack2() {
        Attacks attack = Attacks.getInstance();
        Assertions.assertTrue(Attacks.getInstance().giveAttack("Kratzer") instanceof Attack, "Fehler: Methode giveAttack gibt keine Attacke zurück");
    }
}