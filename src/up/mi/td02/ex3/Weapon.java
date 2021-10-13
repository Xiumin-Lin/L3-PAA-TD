package up.mi.td02.ex3;

public class Weapon {
    private String name;
    private int strength;
    private int nbUses;

    public Weapon(String name, int s, int n) {
        this.name = name;
        this.strength = s;
        this.nbUses = n;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getNbUses() {
        return nbUses;
    }

    public void setNbUses(int nbUses) {
        this.nbUses = nbUses;
    }

    @Override
    public String toString() {
        return name +
                " (F:" + strength +
                " & U:" + nbUses + ')';
    }
}
