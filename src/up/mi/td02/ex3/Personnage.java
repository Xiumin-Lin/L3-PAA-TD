package up.mi.td02.ex3;

import java.util.Arrays;

public class Personnage {
    private static final int NB_ATTACK = 2;
    private String name;
    private int hp;
    private Weapon[] weapons;
    private boolean isAlive;

    public Personnage(String name, int hp, Weapon[] w1) throws Exception {
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
        if(w1.length == NB_ATTACK) this.weapons = w1;
        else throw new Exception("");
    }

    public void attack(Personnage target, int weaponIdx) throws Exception {
        if(weaponIdx < 0 || weaponIdx >= NB_ATTACK) throw new Exception("Invalid weapon index !");
        int nbUses = this.weapons[weaponIdx].getNbUses();
        if(nbUses != 0) {
            target.receiveDmg(this.weapons[weaponIdx].getStrength());
            this.weapons[weaponIdx].setNbUses(nbUses - 1);
        } else throw new Exception("No remaining use of the attack <" +
                this.weapons[weaponIdx].getName() + "> ! ");
    }

    public void attackWithWeapon1(Personnage target) throws Exception {
        attack(target, 0);
    }

    public void attackWithWeapon2(Personnage target) throws Exception {
        attack(target, 1);
    }

    public void receiveDmg(int dmg) {
        this.hp -= dmg;
        if(hp <= 0) {
            this.isAlive = false;
            System.out.println(this.name + " is dead.");
        } else System.out.println(this.name + " receive " + dmg + " dmg. " +
                "HP remaining : " + this.hp);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +
                " (hp:" + hp +
                " | weapons: " + Arrays.toString(weapons) + ')';
    }
}
