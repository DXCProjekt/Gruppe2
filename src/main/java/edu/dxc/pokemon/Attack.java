package edu.dxc.pokemon;

public class Attack {

    private String name;
    private int atk;
    private double acc;
    private String typ;

    public Attack(String name, int atk, double acc, String typ){

        this.name = name;
        this.atk = atk;
        this.acc = acc;
        this.typ = typ;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }




}
