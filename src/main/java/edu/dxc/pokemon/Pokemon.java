package edu.dxc.pokemon;

import java.util.Random;

public class Pokemon {


    private String name, typ, sprite, backSprite;

    private int maxHp, currHp, atk, def, init;

    private final double CRIT = 1.5, TYPCRIT = 1.5, TYPFAIL = 0.5;

    private final int CRITCHANCE = 10;

    private Attack attack1, attack2, attack3, attack4;

    private Attacks atkList = Attacks.getInstance();


    public Pokemon(String name, String typ, int hp, int atk, int def, int init, String sprite, String backSprite, String atkName1, String atkName2, String atkName3, String atkName4) {

        this.name = name;
        this.typ = typ;
        this.sprite = sprite;
        this.backSprite = backSprite;
        this.maxHp = hp;
        this.currHp = hp;
        this.atk = atk;
        this.def = def;
        this.init = init;

        this.attack1 = atkList.giveAttack(atkName1);
        this.attack2 = atkList.giveAttack(atkName2);
        this.attack3 = atkList.giveAttack(atkName3);
        this.attack4 = atkList.giveAttack(atkName4);


    }

    public AttackMove calculateAttack(Attack attacke, Pokemon damagedPokemon) {

        int tempCrit = 0, tempTypeCrit = 0;
        int tempDamage = 0;

        tempDamage = this.atk + attacke.getAtk() - damagedPokemon.getDef();

        if (!attacke.getTyp().equalsIgnoreCase("Normal")) {
            switch (attacke.getTyp()) {

                case "Feuer":
                    if (damagedPokemon.getTyp().equalsIgnoreCase("Pflanze")) {
                        tempTypeCrit = 1;
                        tempDamage = (int) (tempDamage * TYPCRIT);
                        break;
                    } else if (damagedPokemon.getTyp().equalsIgnoreCase("Wasser")) {
                        tempTypeCrit = -1;
                        tempDamage = (int) (tempDamage * TYPFAIL);
                        break;
                    }

                case "Wasser":
                    if (damagedPokemon.getTyp().equalsIgnoreCase("Feuer")) {
                        tempTypeCrit = 1;
                        tempDamage = (int) (tempDamage * TYPCRIT);
                        break;
                    } else if (damagedPokemon.getTyp().equalsIgnoreCase("Pflanze")) {
                        tempTypeCrit = -1;
                        tempDamage = (int) (tempDamage * TYPFAIL);
                        break;

                    }

                case "Pflanze":
                    if (damagedPokemon.getTyp().equalsIgnoreCase("Wasser")) {
                        tempTypeCrit = 1;
                        tempDamage = (int) (tempDamage * TYPCRIT);
                        break;
                    } else if (damagedPokemon.getTyp().equalsIgnoreCase("Feuer")) {
                        tempTypeCrit = -1;
                        tempDamage = (int) (tempDamage * TYPFAIL);
                        break;
                    }

            }

        }

        if (new Random().nextInt(100) + 1 <= CRITCHANCE) {
            tempCrit = 1;
            tempDamage = (int) (tempDamage * CRIT);

        }

        Random r = new Random();
        double randomValue = 0 + (1 - 0) * r.nextDouble();
        System.out.println(randomValue);

        if (randomValue <= attacke.getAcc()) {
            tempCrit -= 1;
            tempDamage = 0;
        }

        AttackMove atkMove = new AttackMove(damagedPokemon, this, attacke.getName(), tempDamage, this.init, tempCrit, tempTypeCrit);

        return atkMove;

    }

    public AttackMove calculateRandomAttack(Pokemon damagedPokemon){

        Attack attacke;
        Random ranAtk = new Random();

        int ranNumber = ranAtk.nextInt(4)+1;

        switch (ranNumber){
            case 1:
                attacke = this.attack1;
                break;
            case 2:
                attacke = this.attack2;
                break;
            case 3:
                attacke = this.attack3;
                break;
            case 4:
                attacke = this.attack4;
                break;
            default:
                attacke = new Attack("Platscher",0,1,"Normal");
                break;

        }

        return this.calculateAttack(attacke, damagedPokemon);
    }



    public boolean isAlive() {
        return currHp > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getBackSprite() {
        return backSprite;
    }

    public void setBackSprite(String backSprite) {
        this.backSprite = backSprite;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrHp() {

        return currHp;
    }

    //Test

    public void setCurrHp(int currHp) {

        if(currHp > this.maxHp){
            this.currHp = this.maxHp;
            return;
        }
        if(currHp < 0){
            this.currHp = 0;
            return;
        }

        this.currHp = currHp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }

    public Attack getAttack1() {
        return attack1;
    }

    public void setAttack1(Attack attack1) {
        this.attack1 = attack1;
    }

    public Attack getAttack2() {
        return attack2;
    }

    public void setAttack2(Attack attack2) {
        this.attack2 = attack2;
    }

    public Attack getAttack3() {
        return attack3;
    }

    public void setAttack3(Attack attack3) {
        this.attack3 = attack3;
    }

    public Attack getAttack4() {
        return attack4;
    }

    public void setAttack4(Attack attack4) {
        this.attack4 = attack4;
    }
}
