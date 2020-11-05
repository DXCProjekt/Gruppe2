package Classes;

public class Pokemon {

    private boolean alive = true;

    private String name, typ, sprite, backSprite;

    private int maxHp, currHp, atk, def, init;

    private Attack a1, a2, a3, a4;

    private AttackList atkList = new AttackList();


    public Pokemon(String name, String typ, int hp, int atk, int def, int init, int a1, int a2, int a3, int a4) {

        this.name = name;
        this.typ = typ;
        this.sprite = sprite;
        this.backSprite = backSprite;
        this.maxHp = hp;
        this.currHp = hp;
        this.atk = atk;
        this.def = def;
        this.init = init;

        this.a1 = atkList.giveAttack(a1);




    }


    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
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

    public void setCurrHp(int currHp) {
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

    public Attack getA1() {
        return a1;
    }

    public void setA1(Attack a1) {
        this.a1 = a1;
    }

    public Attack getA2() {
        return a2;
    }

    public void setA2(Attack a2) {
        this.a2 = a2;
    }

    public Attack getA3() {
        return a3;
    }

    public void setA3(Attack a3) {
        this.a3 = a3;
    }

    public Attack getA4() {
        return a4;
    }

    public void setA4(Attack a4) {
        this.a4 = a4;
    }

}

