package edu.dxc.pokemon;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Attacks {

    private List<Attack> attackList = new ArrayList<Attack>();

    private static Attacks instance = null;

    private Attacks(){

        attackList.add(new Attack("Kratzer",40, 1, "Normal"));
        attackList.add(new Attack("Tackle",40, 1, "Normal"));

        attackList.add(new Attack("Glut",40, 1, "Feuer"));
        attackList.add(new Attack("Feuerzahn",65, 0.9, "Feuer"));
        attackList.add(new Attack("Feuersturm",100, 0.7, "Feuer"));

        attackList.add(new Attack("Aquaknarre",40, 1, "Wasser"));
        attackList.add(new Attack("Aquawelle",65, 0.9, "Wasser"));
        attackList.add(new Attack("Hydropumpe",100, 0.7, "Wasser"));

        attackList.add(new Attack("Rankenhieb",40, 1, "Pflanze"));
        attackList.add(new Attack("Rasierblatt",65, 0.9, "Pflanze"));
        attackList.add(new Attack("Solarstrahl",100, 0.7, "Pflanze"));

    }

    public Attack giveAttack(String attackName) {

        Attack found = new Attack("Platscher", 0,1,"Normal");

        for (int i=0; i < attackList.size(); i++){

            if(attackName == attackList.get(i).getName()){
                found = attackList.get(i);
                break;
            }

        }
        return found;
    }


    public static Attacks getInstance(){

        if(instance == null){

            instance = new Attacks();

        }

        return instance;
    }

}
