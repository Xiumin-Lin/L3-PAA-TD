package up.mi.appli;

import up.mi.td03.ex6.*;

public class Main {
	public static void main(String[] args) {
		// TD1
        /*System.out.println("1 + 2 + 3 = " + UtilMath.somme3(1, 2, 3));
        System.out.println("2^8 = " + UtilMath.power(2, 8));
        System.out.println("fact(5) = " + UtilMath.fact(5));
        System.out.println("comb(3,2) = " + UtilMath.comb(3, 2));
        System.out.println("max2(5,6) = " + UtilMath.max2(5, 6));
        System.out.println("max3v1(5,6,8) = " + UtilMath.max3v1(5, 6, 8));
        System.out.println("max3v2(5,6,8) = " + UtilMath.max3v2(5, 6, 8));

        double[] t = {0.0, 6, 9, 4};
        int[] coeff = {1, 2, 1, 3};
        System.out.println("moyTabDouble(t) = " + UtilMath.moyTabDouble(t));
        System.out.println("medianeTabDouble(t) = " + UtilMath.medianeTabDouble(t));
        System.out.println("moyPondereeTabDouble(t, coeff) = " + UtilMath.moyPondereeTabDouble(t, coeff));
        System.out.println("finalGrade(6, 5) = " + UtilMath.finalGrade(6, 5));

        double[] grp = {5, 6, 9, 7, 9, 2};
        System.out.println("finalGradeGrp(grp) = " + UtilMath.finalGradeGrp(grp));
        System.out.println("formatage(123) = " + UtilMath.formatage(123));
        UtilMath.showMathInterface();
        UtilMath.showMCCInterface();
        System.out.println("6 est un nombre premier : " + UtilMath.isPrimeV1(93));
        System.out.println("6 est un nombre premier V2 : " + UtilMath.isPrimeV2(93));
        System.out.println("6 est un nombre premier V3 : " + UtilMath.isPrimeV3(93));
        System.out.println("Liste de nb 1er inf a 20 : " + UtilMath.showPrimeNumber(20));
        System.out.println("1024 est compose de 2^? " + UtilMath.nbPrimeFactor(1024,2));
        System.out.println(UtilMath.decompositionEnFacteurs1er(360));
        SecretNomber.playPvE();
        int[] a = {1, 3, 5, 7, 9, 0, 1, 2, 5};
        Tri.fusion(a, 0, 5, 8);
        for(int b : a) {
            System.out.print(b + ",");
        }*/

		// TD2 Exo 1
        /*System.out.println(UtilMathPlus.powRationnel(new Rationnel(3, 5), 2));
        Complexe a = new Complexe(2, 3);
        Complexe c = new Complexe(4, 5);
        System.out.println(UtilMathPlus.sommeComplexe(a, c)); // 2*4 - 3*5 = 6 + 8i
        System.out.println(UtilMathPlus.produitComplexe(a, c)); // 2*5 - 3*4 = -7 + 22i*/

		// TD2 Exo 2
        /*Point o = new Point(0, 0);
        Point a = new Point(1, 1);
        Point b = new Point(1, 4);
        System.out.println("La distance de a & b est de : " + a.distance(b));

        Disque d = new Disque(o, 3);
        System.out.println("Le disque contient le pt a ? : " + d.contains(a));
        System.out.println("Le disque contient le pt b ? : " + d.contains(b));

        Disque e = new Disque(new Point(0, 5), 1);
        Disque e2 = new Disque(new Point(0, 5), 3);
        System.out.println("Le disque d intersect le disque e ? : " + d.intersect(e));
        System.out.println("Le disque d intersect le disque e2 ? : " + d.intersect(e2));

        Vecteur v = new Vecteur(o, new Point(3, 3));
        Vecteur u = new Vecteur(new Point(-1, 0), new Point(2, 3));
        System.out.println("v is equals to u ? : " + v.equals(u));

        Vecteur w = new Vecteur(new Point(3, 0), new Point(3, -2));
        System.out.println(a.translation(w)); // res = (1, -1)

        d.translation(w);
        System.out.println(d);*/

		// TD2 Exo 3
        /*try {
            RPG game = new RPG();
            game.play();
        } catch(Exception e) {System.out.println(e.getMessage());}*/

		// TD2 Exo 5
        /*Promotion promo = new Promotion();
        Student a = new Student("Annie");
        Student b = new Student("Bobbi");
        Student c = new Student("Conni");
        Student d = new Student("Danni");
        Student e = new Student("Ellie");
        Student f = new Student("Fanny");
        promo.addStudent(a);
        promo.addStudent(b);
        promo.addStudent(c);
        promo.addNoteCC(a, UE.PROG, 20);
        promo.addNoteCC(b, UE.PROG, 13);
        promo.addNoteCC(c, UE.PROG, 10);
        promo.addNoteCC(a, UE.ALGO, 14);
        promo.addNoteCC(b, UE.ALGO, 19);
        promo.addNoteCC(c, UE.ALGO, 9);
        promo.addNoteExam(a, UE.PROG, 18);
        promo.addNoteExam(b, UE.PROG, 13);
        promo.addNoteExam(c, UE.PROG, 8);
        promo.addNoteExam(a, UE.ALGO, 12);
        promo.addNoteExam(b, UE.ALGO, 19);
        promo.addNoteExam(c, UE.ALGO, 11);
        promo.showAllStudentAveragePerUE();
        promo.showOverallAveragePerUE();
        System.out.println("Promo Overall Average : " + promo.getOverallAverage());
        promo.showValedictorian();
        promo.showValedictorianPerUE();*/

		// TD2 Exo 6
		/*RepertoireSimple rep = new RepertoireSimple();
		rep.addPersonne("John", "Lennon", "0123456789");
		rep.addPersonne("Paul ", "McCartney", "0234567891");
		rep.addPersonne("George", "Harrison ", "0345678912");
		rep.addPersonne("Ringo", " S t a r r ", "0456789123");
		System.out.println(rep.chercheNumero("John", "Lennon"));
		System.out.println(rep.chercheNumero("Paul ", "McCartney"));
		System.out.println(rep.chercheNumero(" Freddie ", "Mercury"));*/

		// TD2 Exo 7
		/*HashMap<String, ArrayList<String>> dico = new HashMap<>();
		System.out.println(T9.stringInT9("bonjour"));
		T9.enregistrer(dico, "bonjour");
		T9.enregistrer(dico, "bonne");
		T9.enregistrer(dico, "comme");
		System.out.println(T9.recuperer(dico, "26663"));
		System.out.println(T9.recuperer(dico, "2665687"));
		System.out.println(T9.recuperer(dico, "123456"));*/

		// TD3 Exo 2
		/*Disque d = new Disque(new Point(3.5, 4), 4);
		Losange l = new Losange(new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(0, 2));
		System.out.println(d);
		System.out.println(l);
		Vecteur v = new Vecteur(new Point(2, 2), new Point(3, 3));
		System.out.println(d.translation(v));
		System.out.println(l.translation(v));*/

		// TD3 Exo 3
		/*RepertoireAmeliore rep = new RepertoireAmeliore(
				new Personne("Jimi", "Hendrix", "0987654321"));
		rep.addPersonne("Jhon", "Lennon", "0123456789");
		rep.addPersonne("Paul", "McCartney", "0234567891");
		rep.addPersonne("George", "Harrison", "0345678912");
		rep.addPersonne("Ringo", "Starr", "0456789123");
		rep.addPersonne("Sean", "Lennon", "0567891234");

		System.out.println(rep.chercheNumero("Jhon", "Lennon"));
		System.out.println(rep.chercheNumero("Freddie", "Mercury"));
		System.out.println(rep.cherchePersonne("0234567891"));
		System.out.println(rep.cherchePersonne("0234567899"));
		System.out.println(rep);*/

		// TD3 Exo 4
		/*DVD aDVD = new DVD("The Good Place", 20, "Michael Schur");
		Livre aBook = new Livre("Dune", 10, "Frank Herbert", "2-221-02602-0");
		Fruit aFruit = new Fruit("Pomme", 1, "France");
		Medicament aMedoc = new Medicament("Doliprane 1000mg", 2, "Sanofi", 8);
		System.out.println(aDVD);
		System.out.println(aBook);
		System.out.println(aFruit);
		System.out.println(aMedoc);*/

		// TD3 Exo 5
		/*List<ProgrammeTV> grilleDeProgTV = new ArrayList<>();
		grilleDeProgTV.add(new JournalTV("Jack Pera", 8, 9));
		grilleDeProgTV.add(new EmissionDivertissement("Hahaha", 9, "Amy Sant"));
		grilleDeProgTV.add(new Fiction("Brooklyn 99", 11, 16,
				"Dan Goor & Michael Schur", false));
		grilleDeProgTV.add(new Reportage("Les Chats", 16, 20, ThemeTV.CULTURE));
		grilleDeProgTV.add(new JournalTV("Raymond Hol", 20, 21));
		grilleDeProgTV.add(new Fiction("Brooklyn 99", 21, 8,
				"Dan Goor & Michael Schur", true));
		for(ProgrammeTV program : grilleDeProgTV) {
			System.out.println(program);
		}*/

		// TD3 Exo 6
		// (3.5 + 5.7) * (3.2 - (5.0 / 2.0)) = (a + b) * (c - (d / e))
		Valeur a = new Valeur(3.5);
		Valeur b = new Valeur(5.7);
		Valeur c = new Valeur(3.2);
		Valeur d = new Valeur(5);
		Valeur e = new Valeur(2);
		Somme ab = new Somme(a, b);
		Division de = new Division(d, e);
		Soustraction cde = new Soustraction(c, de);
		Multiplication abcde = new Multiplication(ab, cde);
		System.out.println("(3.5 + 5.7) = " + ab.evaluer());
		System.out.println("(5.0 / 2.0) = " + de.evaluer());
		System.out.println("(3.2 - (5.0 / 2.0)) = " + cde.evaluer());
		System.out.println("(3.5 + 5.7) * (3.2 - (5.0 / 2.0)) = " + abcde.evaluer());

		// 5.0 * 2.0 * (3.5 + 5.7 + 3.2) = d * e * (a + b + c)
		AdditionNAire abc = new AdditionNAire();
		abc.ajouterOperateur(a);
		abc.ajouterOperateur(b);
		abc.ajouterOperateur(c);
		MultiplicationNAire deabc = new MultiplicationNAire();
		deabc.ajouterOperateur(d);
		deabc.ajouterOperateur(e);
		deabc.ajouterOperateur(abc);
		System.out.println("5.0 * 2.0 * (3.5 + 5.7 + 3.2) = " + deabc.evaluer());

	}
}
