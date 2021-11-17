package up.mi.td02;

import up.mi.jgm.maths.Complexe;
import up.mi.jgm.maths.Rationnel;
import up.mi.td02.ex1.UtilMathPlus;
import up.mi.td02.ex2.Disque;
import up.mi.td02.ex2.Point;
import up.mi.td02.ex2.Vecteur;
import up.mi.td02.ex3.RPG;
import up.mi.td02.ex5.Promotion;
import up.mi.td02.ex5.Student;
import up.mi.td02.ex5.UE;
import up.mi.td02.ex6.RepertoireSimple;
import up.mi.td02.ex7.T9;

import java.util.ArrayList;
import java.util.HashMap;

public class Td02 {
	public static void runTd() {
		runEx1();
		runEx2();
		runEx3();
		runEx5();
		runEx6();
		runEx7();
	}

	public static void runEx1() {
		System.out.println(UtilMathPlus.powRationnel(new Rationnel(3, 5), 2));
		Complexe a = new Complexe(2, 3);
		Complexe c = new Complexe(4, 5);
		System.out.println(UtilMathPlus.sommeComplexe(a, c)); // 2*4 - 3*5 = 6 + 8i
		System.out.println(UtilMathPlus.produitComplexe(a, c)); // 2*5 - 3*4 = -7 + 22i
	}

	private static void runEx2() {
		Point o = new Point(0, 0);
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
		System.out.println(d);
	}

	private static void runEx3() {
		try {
			RPG game = new RPG();
			game.play();
		} catch(Exception e) {System.out.println(e.getMessage());}
	}

	private static void runEx5() {
		Promotion promo = new Promotion();
		Student a = new Student("Annie");
		Student b = new Student("Bobbi");
		Student c = new Student("Conni");
//		Student d = new Student("Danni");
//		Student e = new Student("Ellie");
//		Student f = new Student("Fanny");
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
		promo.showValedictorianPerUE();
	}

	private static void runEx6() {
		RepertoireSimple rep = new RepertoireSimple();
		rep.addPersonne("John", "Lennon", "0123456789");
		rep.addPersonne("Paul ", "McCartney", "0234567891");
		rep.addPersonne("George", "Harrison ", "0345678912");
		rep.addPersonne("Ringo", " S t a r r ", "0456789123");
		System.out.println(rep.chercheNumero("John", "Lennon"));
		System.out.println(rep.chercheNumero("Paul ", "McCartney"));
		System.out.println(rep.chercheNumero(" Freddie ", "Mercury"));
	}

	private static void runEx7() {
		HashMap<String, ArrayList<String>> dico = new HashMap<>();
		System.out.println(T9.stringInT9("bonjour"));
		T9.enregistrer(dico, "bonjour");
		T9.enregistrer(dico, "bonne");
		T9.enregistrer(dico, "comme");
		System.out.println(T9.recuperer(dico, "26663"));
		System.out.println(T9.recuperer(dico, "2665687"));
		System.out.println(T9.recuperer(dico, "123456"));
	}
}
