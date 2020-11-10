package edu.dxc.pokemon;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Pokemons {

    private List<Pokemon> pokemonList = new ArrayList<Pokemon>();

    private static Pokemons instance = null;


    private Pokemons(){

        pokemonList.add(new Pokemon("Glumanda", "Feuer", 150, 30, 10, 65, "file:resources/pokemon/charmanderBack.png", "file:resources/pokemon/charmanderFront.png", "Kratzer", "Glut","Feuerzahn", "Feuersturm"));
        pokemonList.add(new Pokemon("Schiggy", "Wasser", 200,  20, 20, 43, "file:resources/pokemon/squirtleBack.png", "file:resources/pokemon/squirtleFront.png", "Kratzer", "Aquaknarre", "Aquawelle", "Hydropumpe"));
        pokemonList.add(new Pokemon("Bisasam", "Pflanze", 250, 10,30, 45, "file:resources/pokemon/bulbasaurBack.png", "file:resources/pokemon/bulbasaurFront.png", "Tackle", "Rankenhieb", "Rasierblatt", "Solarstrahl"));

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
