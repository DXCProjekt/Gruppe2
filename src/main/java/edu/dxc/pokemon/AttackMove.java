package edu.dxc.pokemon;

public class AttackMove {

    private Pokemon damagedPokemon;
    private int damage;
    private int initiative;
    private int crit, typcrit;


    public AttackMove(Pokemon damagedPokemon, int damage, int initiative, int crit, int typcrit){

        this.damagedPokemon = damagedPokemon;
        this.damage = damage;
        this.initiative = initiative;
        this.crit = crit;
        this.typcrit = typcrit;

    }

    public Pokemon getDamagedPokemon() {
        return damagedPokemon;
    }

    public void setDamagedPokemon(Pokemon damagedPokemon) {
        System.out.println("Cant change AttackMove values");
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        System.out.println("Cant change AttackMove values");
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        System.out.println("Cant change AttackMove values");
    }

    public int getCrit() {
        return crit;
    }

    public int getTypcrit() {
        return typcrit;
    }
}
