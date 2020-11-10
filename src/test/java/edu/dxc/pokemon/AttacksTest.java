package edu.dxc.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AttacksTest {

    @Test
    void giveAttack() {
        Assertions.assertTrue(true, "Something is wong with our configuration!");
    }

    @Test
    public void testExample2(){
        String name = "Anne";
        Assertions.assertTrue(name.equalsIgnoreCase("AnnE"), "Expected a correct name check, but the given name was not exspected.");

    }

}