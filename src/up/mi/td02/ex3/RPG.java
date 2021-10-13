package up.mi.td02.ex3;

import java.util.Random;
import java.util.Scanner;

public class RPG {
    private static final Random rand = new Random();
    private Personnage playerP;
    private Personnage computerP;
    private final Personnage[] pList;

    public RPG() throws Exception {
        this.playerP = null;
        this.computerP = null;
        pList = initAllPersonnages();
    }

    public Personnage[] initAllPersonnages() throws Exception {
        final String sword = "Sword";
        Personnage aragorn = new Personnage("Aragorn", 100, new Weapon[]{
                new Weapon(sword, 8, 10),
                new Weapon("Arc", 5, 8)});
        Personnage gimli = new Personnage("Gimli", 100, new Weapon[]{
                new Weapon(sword, 8, 8),
                new Weapon("Axe", 9, 12)});
        Personnage legolas = new Personnage("Legolas", 100, new Weapon[]{
                new Weapon(sword, 8, 6),
                new Weapon("Arc", 7, 15)});

        return new Personnage[]{aragorn, gimli, legolas};
    }

    public void play() {
        selectionPersonnages();

        // TODO fight
    }

    private void selectionPersonnages() {
        System.out.println("Select your personnage (give his number) :");
        for(int i = 0; i < pList.length; i++) {
            System.out.println("(" + (i + 1) + ") " + pList[i].getName());
        }
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(">>> ");
            int choice = sc.nextInt() - 1;
            if(choice >= 0 && choice < pList.length) {
                playerP = pList[choice];
                break;
            } else System.out.println("Invalid choice, retry !");
        } while(true);
        this.computerP = randPerso();
        System.out.println("Player   : " + playerP);
        System.out.println("Computer : " + computerP);
    }

    public Personnage randPerso() {
        int pcIdx;
        do {
            pcIdx = rand.nextInt(pList.length);
        } while(pList[pcIdx].getName().equals(this.playerP.getName()));
        return pList[pcIdx];
    }
}
