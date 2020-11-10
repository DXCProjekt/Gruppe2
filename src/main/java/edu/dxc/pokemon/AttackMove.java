package edu.dxc.pokemon;

public class AttackMove {

    private Pokemon damagedPokemon;
    private Pokemon movingPokemon;
    private String attackName;
    private int damage;
    private int initiative;
    private int crit, typcrit;


    public AttackMove(Pokemon damagedPokemon, Pokemon movingPokemon, String attackNamem, int damage, int initiative, int crit, int typcrit){

        this.attackName = attackNamem;
        this.movingPokemon = movingPokemon;
        this.damagedPokemon = damagedPokemon;
        this.damage = damage;
        this.initiative = initiative;
        this.crit = crit;
        this.typcrit = typcrit;

    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public void setTypcrit(int typcrit) {
        this.typcrit = typcrit;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public Pokemon getMovingPokemon() {
        return movingPokemon;
    }

    public void setMovingPokemon(Pokemon movingPokemon) {
        this.movingPokemon = movingPokemon;
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
