package edu.dxc.pokemon;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Pokemons {

    private List<Pokemon> pokemonList = new ArrayList<Pokemon>();

    private static Pokemons instance = null;


    private Pokemons(){

        pokemonList.add(new Pokemon("Glumanda", "Feuer", 150, 30, 10, 65, null, null, "Kratzer", "Glut","Feuerzahn", "Freuersturm"));
        pokemonList.add(new Pokemon("Schiggy", "Wasser", 200,  20, 20, 43, null, null, "Kratzer", "Aquaknarre", "Aquawelle", "Hydropumpe"));
        pokemonList.add(new Pokemon("Bisasam", "Pflanze", 250, 10,30, 45, null, null, "Tackle", "Rankenhieb", "Rasierblatt", "Solarstrahl"));

    }


    public Pokemon giveRandomPokemon() {

        Random zufall = new Random();

        return pokemonList.get(zufall.nextInt(3));

    }

    public static Pokemons getInstance() {

        if (instance == null) {

            instance = new Pokemons();

        }


        return instance;
    }
}
