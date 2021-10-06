package up.mi.td01;

import java.util.Random;
import java.util.Scanner;

public class SecretNomber {
    private static final Random RAND = new Random();

    private SecretNomber() {
    }
    // ---------- TD1 Ex 9 ----------

    /**
     * Player (select a number) vs Ordi (find the number)
     */
    public static void playPvE() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Launch Secret Nomber PvE !\n" +
                "Enter the secret number : ");
        int secretNB = sc.nextInt();
        sc.nextLine();
        int min = 1;
        int max = 100;
        int ordiNb = 0;
        boolean isFind = false;
        do {
            ordiNb = RAND.nextInt(max - min + 1) + min;
            System.out.println("It's " + ordiNb + "?");
            try {
                System.out.println("(1) It's less\n" +
                        "(2) It's more\n" +
                        "(3) You find it !\n" +
                        ">>> ");
                switch(sc.nextInt()) {
                    case 1: // less
                        if(secretNB < ordiNb) {
                            max = ordiNb;
                            break;
                        } else throw new Exception("No, the secret number is not more than " + ordiNb);
                    case 2: // more
                        if(secretNB > ordiNb) {
                            min = ordiNb;
                            break;
                        } else throw new Exception("No, the secret number is not less than " + ordiNb);
                    case 3: // equal
                        if(secretNB == ordiNb) {
                            System.out.println("GG, you find it");
                            isFind = true;
                            break;
                        } else throw new Exception("No it's not your secret number !");
                    default:
                        throw new Exception("Invalid Input");
                }
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
            sc.nextLine();
        } while(!isFind);
        System.out.println("Thank for playing !");
    }
}
