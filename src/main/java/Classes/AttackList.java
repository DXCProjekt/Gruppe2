package Classes;

import java.util.ArrayList;
import java.util.List;


public class AttackList {

    List<Attack> al = new ArrayList<Attack>();
    Attack kratzer = new Attack("Kratzer",40, 1, "Normal");

    public AttackList(){
        al.add(kratzer);
    }


    public Attack giveAttack(int i) {

        return al.get(i);
    }

}
