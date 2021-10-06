package up.mi.td01;

import java.util.Arrays;
import java.util.Scanner;

public class UtilMath {
    private UtilMath() {
    }
    // ---------- Ex 1 ----------

    /**
     * Somme de 3 int
     *
     * @param a first int
     * @param b second int
     * @param c third int
     * @return a + b + c
     */
    public static int somme3(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Calcule la factorielle n!
     *
     * @param n an int
     * @return n!
     */
    public static long fact(int n) throws Exception {
        if(n < 0)
            throw new Exception("fact(" + n + ") impossible, n doit etre positif !");

        int l = 1;
        for(int i = 2; i <= n; i++) {
            l *= i;
        }
        return l;
    }

    /**
     * Calcule la combinaison (n p) de 2 int
     * Il faut que p <= n
     *
     * @param n value
     * @param p value
     * @return (n p)
     */
    public static long comb(int n, int p) throws Exception {
        if(p > n)
            throw new Exception("comb(" + n + " " + p + ") impossible ! p ne doit pas etre plus grand que n !");
        return fact(n) / (fact(p) * fact(n - p));
    }

    /**
     * Calcule n^m
     *
     * @param n value
     * @param m value
     * @return n**m
     */
    public static long power(int n, int m) {
        long l = 1;
        for(int i = 0; i < m; i++) {
            l *= n;
        }
        return l;
    }

    // ---------- Ex 2 ----------

    /**
     * The max between a and b
     *
     * @param a value
     * @param b value
     * @return max between a and b
     */
    public static int max2(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Max between 3 int (no use of max2)
     *
     * @param a
     * @param b
     * @param c
     * @return max between 3 int
     */
    public static int max3v1(int a, int b, int c) {
        if(a > b)
            return (a > c) ? a : c;
        return (b > c) ? b : c;
    }

    /**
     * Max between 3 int (use of max2)
     *
     * @param a value
     * @param b value
     * @param c value
     * @return max between 3 int
     */
    public static int max3v2(int a, int b, int c) {
        int maxLocal = max2(a, b);
        return (maxLocal > c) ? maxLocal : c;
    }

    // ---------- Ex 3 ----------

    /**
     * Moyenne des elements dans un tab de double
     *
     * @param t tableau de double
     * @return la moyenne des elements
     */
    public static double moyTabDouble(double[] t) throws Exception {
        if(t.length == 0) throw new Exception("Votre tableau est vide !");
        double moy = 0.0;
        for(double d : t) moy += d;
        return moy / t.length;
    }

    public static double medianeTabDouble(double[] t) throws Exception {
        if(t.length == 0) throw new Exception("Votre tableau est vide !");
        int mid = t.length / 2;
        double[] tCopy = Arrays.copyOf(t, t.length);
        Arrays.sort(tCopy);
        return (tCopy.length % 2 == 0) ? (tCopy[mid] + tCopy[mid - 1]) / 2 : tCopy[mid];
    }

    public static double moyPondereeTabDouble(double[] notes, int[] coeff) throws Exception {
        if(notes.length == 0 || coeff.length == 0) throw new Exception("Au moins un tableau est vide !");
        else if(notes.length != coeff.length) throw new Exception("Vos 2 tabs doivent etre de meme taille !");

        int totalCoeff = 0;
        for(int i : coeff) {
            totalCoeff += i;
        }
        if(totalCoeff == 0) throw new Exception("La somme des coeff est nul !!!");

        double totalNotes = 0.0;
        for(int i = 0; i < notes.length; i++) {
            totalNotes += notes[i] * coeff[i];
        }
        return totalNotes / totalCoeff;
    }

    // ---------- Ex 4 ----------
    public static double finalGrade(double noteCC, double noteExam) {
        return (noteExam >= noteCC) ? noteExam : (noteCC + noteExam) / 2;
    }

    public static double finalGradeGrp(double[] notes) throws Exception {
        if(notes.length == 0) throw new Exception("Au moins un tableau est vide !");
        else if(notes.length % 2 == 1) throw new Exception("la longueur du tab n'est pas pair");
        int grpGrade = 0;
        for(int i = 0; i < notes.length; i += 2) {
            grpGrade += finalGrade(notes[i], notes[i + 1]);
        }
        return grpGrade / ((double) notes.length / 2);
    }

    // ---------- Ex 5 ----------
    public static String formatage(int n) throws Exception {
        int maxLength = 5;
        if(n >= (power(10, maxLength - 1))) throw new Exception("N doit etre inf a 10000");
        StringBuilder finalStr = new StringBuilder("");
        String nInStr = String.valueOf(n);
        finalStr.append("_".repeat(maxLength - nInStr.length()));
        return finalStr.append(nInStr).toString();
    }

    // ---------- Ex 6 ----------
    public static void showMathInterface() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean isEnd = false;
        System.out.println("Interface de UtilMath");
        do {
            System.out.print("Veillez choisir votre action :\n" +
                    "(1) Somme de 3 entiers\n" +
                    "(2) Factorielle d'un entier\n" +
                    "(3) Combinaison de 2 entiers\n" +
                    "(4) Puissance m d'un entier\n" +
                    "(0) Quitter\n" +
                    ">>> ");
            final String RESULT = "Result : ";
            switch(sc.nextInt()) {
                case 1:
                    sc.nextLine(); // clear scanner
                    System.out.print("Entrer les 3 entiers à additionner (ex : 1 2 3) : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println(RESULT + somme3(a, b, c));
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Entrer un entier pour le factorielle : ");
                    System.out.println(RESULT + fact(sc.nextInt()));
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Entrer les 2 pour la combinaison (ex : 5 3) : ");
                    System.out.println(RESULT + comb(sc.nextInt(), sc.nextInt()));
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Entrer un entier n et sa puissance m (ex : 2 3) : ");
                    System.out.println(RESULT + power(sc.nextInt(), sc.nextInt()));
                    break;
                case 0:
                default:
                    System.out.println("End");
                    isEnd = true;
                    break;
            }
            System.out.println();
            sc.nextLine();
        } while(!isEnd);
    }

    // ---------- Ex 7 ----------
    public static void showMCCInterface() throws Exception {
        System.out.print("Interface de calcul de la moyenne d'un grp.\n" +
                "Veillez entrer le nb d'etudiant : ");
        Scanner sc = new Scanner(System.in);
        int nbStudent = sc.nextInt();
        double[] notes = new double[nbStudent * 2];
        System.out.print("Veillez entrer la note de cc & d'exam de ");
        for(int i = 0; i < nbStudent * 2; i += 2) {
            sc.nextLine();
            System.out.print("Etudiant numero " + i + " : ");
            notes[i] = sc.nextDouble();
            notes[i + 1] = sc.nextDouble();
            System.out.println();
        }
        System.out.println("Moyenne du grp : " + finalGradeGrp(notes));
    }

    // ---------- Ex 8 ----------
    // 1.a
    public static boolean isPrimeV1(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    // 1.b
    public static boolean isPrimeV2(int n) {
//        return (n % 2 != 0 || n == 2) ? isPrimeV1(n) : false
        return (n % 2 != 0 || n == 2) && isPrimeV1(n);
    }

    // 1.c
    public static boolean isPrimeV3(int n) {
        if(n % 2 == 0 && n != 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    // 2
    public static String showPrimeNumber(int max) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 2; i < max; i++) {
            if(isPrimeV3(i)) sb.append(i).append(", ");
        }
        return sb.deleteCharAt(sb.lastIndexOf(",")).toString();
    }

    // 3.a
    public static int nbPrimeFactor(int n, int p) {
        int cpt = 0;
        while(n % p == 0) {
            cpt++;
            n /= p;
        }
        return cpt;
    }
    // 3.b
    public static String decompositionEnFacteurs1er(int n){
        StringBuilder sb = new StringBuilder("");
        int nbFactor = 0;
        for(int i = 2; i < n; i++) {
            if(isPrimeV3(i)){
                nbFactor = nbPrimeFactor(n, i);
                sb.append((nbFactor != 0) ? i + "^" + nbFactor : "");
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}


