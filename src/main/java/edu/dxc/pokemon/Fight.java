package edu.dxc.pokemon;


public class Fight {
    public Pokemons  pokemons = Pokemons.getInstance();

    public Pokemon myPokemon = pokemons.giveRandomPokemon();
    public Pokemon oppoPokemon = pokemons.giveRandomPokemon();

    public AttackMove myMove;
    public AttackMove oppoMove;
    public AttackMove firstMove;
    public AttackMove secondMove;


    public boolean startRound(Attack myAttack){
        myMove=myPokemon.calculateAttack(myAttack,oppoPokemon);
        oppoMove=oppoPokemon.calculateRandomAttack(myPokemon);

        if (myMove.getInitiative()>=oppoMove.getInitiative()){
            firstMove=myMove;
            secondMove=oppoMove;
        }else{
            firstMove=oppoMove;
            secondMove=myMove;
        }

        Pokemon damagedPokemon = firstMove.getDamagedPokemon();
        damagedPokemon.setCurrHp(damagedPokemon.getCurrHp()-firstMove.getDamage());
        if (damagedPokemon.getCurrHp() <= 0) return false;

        damagedPokemon = secondMove.getDamagedPokemon();
        damagedPokemon.setCurrHp(damagedPokemon.getCurrHp()-secondMove.getDamage());
        if (damagedPokemon.getCurrHp() <= 0) return false;

        return true;

    }



}
