package edu.dxc.pokemon;

public class Fight {

    Pokemons pokemons = Pokemons.getInstance();

    public Pokemon myPokemon = pokemons.giveRandomPokemon();
    public Pokemon oppoPokemon = pokemons.giveRandomPokemon();

    public AttackMove my;
    public AttackMove oppoAttack;

    public void startRound(Attack attack){




    }
}
