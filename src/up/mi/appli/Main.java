package up.mi.appli;

import up.mi.td02.ex6.RepertoireSimple;

public class Main {
	public static void main(String[] args) {
//        System.out.println("1 + 2 + 3 = " + UtilMath.somme3(1, 2, 3));
//        System.out.println("2^8 = " + UtilMath.power(2, 8));
//        System.out.println("fact(5) = " + UtilMath.fact(5));
//        System.out.println("comb(3,2) = " + UtilMath.comb(3, 2));
//        System.out.println("max2(5,6) = " + UtilMath.max2(5, 6));
//        System.out.println("max3v1(5,6,8) = " + UtilMath.max3v1(5, 6, 8));
//        System.out.println("max3v2(5,6,8) = " + UtilMath.max3v2(5, 6, 8));
//
//        double[] t = {0.0, 6, 9, 4};
//        int[] coeff = {1, 2, 1, 3};
//        System.out.println("moyTabDouble(t) = " + UtilMath.moyTabDouble(t));
//        System.out.println("medianeTabDouble(t) = " + UtilMath.medianeTabDouble(t));
//        System.out.println("moyPondereeTabDouble(t, coeff) = " + UtilMath.moyPondereeTabDouble(t, coeff));
//        System.out.println("finalGrade(6, 5) = " + UtilMath.finalGrade(6, 5));
//
//        double[] grp = {5, 6, 9, 7, 9, 2};
//        System.out.println("finalGradeGrp(grp) = " + UtilMath.finalGradeGrp(grp));
//        System.out.println("formatage(123) = " + UtilMath.formatage(123));
//        UtilMath.showMathInterface();
//        UtilMath.showMCCInterface();
//        System.out.println("6 est un nombre premier : " + UtilMath.isPrimeV1(93));
//        System.out.println("6 est un nombre premier V2 : " + UtilMath.isPrimeV2(93));
//        System.out.println("6 est un nombre premier V3 : " + UtilMath.isPrimeV3(93));
//        System.out.println("Liste de nb 1er inf a 20 : " + UtilMath.showPrimeNumber(20));
//        System.out.println("1024 est compose de 2^? " + UtilMath.nbPrimeFactor(1024,2));
//        System.out.println(UtilMath.decompositionEnFacteurs1er(360));
//        SecretNomber.playPvE();
//        int[] a = {1, 3, 5, 7, 9, 0, 1, 2, 5};
//        Tri.fusion(a, 0, 5, 8);
//        for(int b : a) {
//            System.out.print(b + ",");
//        }

		// TD2 Exo 1
//        System.out.println(UtilMathPlus.powRationnel(new Rationnel(3, 5), 2));
//        Complexe a = new Complexe(2, 3);
//        Complexe c = new Complexe(4, 5);
//        System.out.println(UtilMathPlus.sommeComplexe(a, c)); // 2*4 - 3*5 = 6 + 8i
//        System.out.println(UtilMathPlus.produitComplexe(a, c)); // 2*5 - 3*4 = -7 + 22i

		// TD2 Exo 2
//        Point o = new Point(0, 0);
//        Point a = new Point(1, 1);
//        Point b = new Point(1, 4);
//        System.out.println("La distance de a & b est de : " + a.distance(b));
//
//        Disque d = new Disque(o, 3);
//        System.out.println("Le disque contient le pt a ? : " + d.contains(a));
//        System.out.println("Le disque contient le pt b ? : " + d.contains(b));
//
//        Disque e = new Disque(new Point(0, 5), 1);
//        Disque e2 = new Disque(new Point(0, 5), 3);
//        System.out.println("Le disque d intersect le disque e ? : " + d.intersect(e));
//        System.out.println("Le disque d intersect le disque e2 ? : " + d.intersect(e2));
//
//        Vecteur v = new Vecteur(o, new Point(3, 3));
//        Vecteur u = new Vecteur(new Point(-1, 0), new Point(2, 3));
//        System.out.println("v is equals to u ? : " + v.equals(u));
//
//        Vecteur w = new Vecteur(new Point(3, 0), new Point(3, -2));
//        System.out.println(a.translation(w)); // res = (1, -1)
//
//        d.translation(w);
//        System.out.println(d);

		// TD2 Exo 3
//        try {
//            RPG game = new RPG();
//            game.play();
//        } catch(Exception e) {System.out.println(e.getMessage());}

		// TD2 Exo 5
//        Promotion promo = new Promotion();
//        Student a = new Student("Annie");
//        Student b = new Student("Bobbi");
//        Student c = new Student("Conni");
//        Student d = new Student("Danni");
//        Student e = new Student("Ellie");
//        Student f = new Student("Fanny");
//        promo.addStudent(a);
//        promo.addStudent(b);
//        promo.addStudent(c);
//        promo.addNoteCC(a, UE.PROG, 20);
//        promo.addNoteCC(b, UE.PROG, 13);
//        promo.addNoteCC(c, UE.PROG, 10);
//        promo.addNoteCC(a, UE.ALGO, 14);
//        promo.addNoteCC(b, UE.ALGO, 19);
//        promo.addNoteCC(c, UE.ALGO, 9);
//        promo.addNoteExam(a, UE.PROG, 18);
//        promo.addNoteExam(b, UE.PROG, 13);
//        promo.addNoteExam(c, UE.PROG, 8);
//        promo.addNoteExam(a, UE.ALGO, 12);
//        promo.addNoteExam(b, UE.ALGO, 19);
//        promo.addNoteExam(c, UE.ALGO, 11);
//        promo.showAllStudentAveragePerUE();
//        promo.showOverallAveragePerUE();
//        System.out.println("Promo Overall Average : " + promo.getOverallAverage());
//        promo.showValedictorian();
//        promo.showValedictorianPerUE();

		// TD2 Exo 6
		RepertoireSimple rep = new RepertoireSimple();
		rep.addPersonne("John", "Lennon", "0123456789");
		rep.addPersonne("Paul ", "McCartney", "0234567891");
		rep.addPersonne("George", "Harrison ", "0345678912");
		rep.addPersonne("Ringo", " S t a r r ", "0456789123");
		System.out.println(rep.chercheNumero("John", "Lennon"));
		System.out.println(rep.chercheNumero("Paul ", "McCartney"));
		System.out.println(rep.chercheNumero(" Freddie ", "Mercury"));
	}
}
