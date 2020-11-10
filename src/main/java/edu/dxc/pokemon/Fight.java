package edu.dxc.pokemon;


public class Fight {
    public Pokemons  pokemons = Pokemons.getInstance();

    public Pokemon myPokemon = pokemons.giveRandomPokemon();
    public Pokemon oppoPokemon = pokemons.giveRandomPokemon();
    public AttackMove myMove;
    public AttackMove oppoMove;
    public AttackMove firstMove;
    public AttackMove secondMove;
    public String battleText;
    public String battleText2;

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

        battleText = firstMove.getMovingPokemon().getName() + " setzt " + firstMove.getAttackName() + " ein. \n";

        if (firstMove.getCrit() >= 0) {
            if (firstMove.getTypcrit() != 0) {
                if (firstMove.getTypcrit() == 1) {
                    battleText += "Die Attacke ist sehr effektiv! \n";
                } else if (firstMove.getTypcrit() == -1) {
                    battleText += "Die Attacke war nicht sehr effektiv! \n";
                }
            }

            if (firstMove.getCrit() == 1) {
                battleText += "VOLLTREFFER! \n";
            }
        } else {
            battleText += "Attacke ging daneben! \n";
        }

        battleText2 = secondMove.getMovingPokemon().getName() + " setzt " + secondMove.getAttackName() + " ein. \n";

        if (secondMove.getCrit() >= 0) {
            if (secondMove.getTypcrit() != 0) {
                if (secondMove.getTypcrit() == 1) {
                    battleText2 += "Die Attacke ist sehr effektiv! \n";
                } else if (secondMove.getTypcrit() == -1) {
                    battleText2 += "Die Attacke war nicht sehr effektiv! \n";
                }
            }

            if (secondMove.getCrit() == 1) {
                battleText2 += "VOLLTREFFER! \n";
            }
        } else {
            battleText2 += "Attacke ging daneben! \n";
        }


                Pokemon damagedPokemon = firstMove.getDamagedPokemon();
        damagedPokemon.setCurrHp(damagedPokemon.getCurrHp()-firstMove.getDamage());
        if (damagedPokemon.getCurrHp() <= 0) return false;
        battleText += battleText2;

        damagedPokemon = secondMove.getDamagedPokemon();
        damagedPokemon.setCurrHp(damagedPokemon.getCurrHp()-secondMove.getDamage());
        if (damagedPokemon.getCurrHp() <= 0) return false;

        return true;

    }



}
