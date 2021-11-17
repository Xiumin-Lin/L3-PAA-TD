package up.mi.td03;

import up.mi.td02.ex2.Point;
import up.mi.td02.ex2.Vecteur;
import up.mi.td02.ex6.Personne;
import up.mi.td03.ex2.Disque;
import up.mi.td03.ex2.Losange;
import up.mi.td03.ex3.RepertoireAmeliore;
import up.mi.td03.ex4.DVD;
import up.mi.td03.ex4.Fruit;
import up.mi.td03.ex4.Livre;
import up.mi.td03.ex4.Medicament;
import up.mi.td03.ex5.*;
import up.mi.td03.ex6.*;

import java.util.ArrayList;
import java.util.List;

public class Td03 {
	public static void runTd() {
		runEx2();
		runEx3();
		runEx4();
		runEx5();
		runEx6();
	}

	private static void runEx2() {
		Disque d = new Disque(new Point(3.5, 4), 4);
		Losange l = new Losange(new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(0, 2));
		System.out.println(d);
		System.out.println(l);
		Vecteur v = new Vecteur(new Point(2, 2), new Point(3, 3));
		System.out.println(d.translation(v));
		System.out.println(l.translation(v));
	}

	private static void runEx3() {
		RepertoireAmeliore rep = new RepertoireAmeliore(
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
		System.out.println(rep);
	}

	private static void runEx4() {
		DVD aDVD = new DVD("The Good Place", 20, "Michael Schur");
		Livre aBook = new Livre("Dune", 10, "Frank Herbert", "2-221-02602-0");
		Fruit aFruit = new Fruit("Pomme", 1, "France");
		Medicament aMedoc = new Medicament("Doliprane 1000mg", 2, "Sanofi", 8);
		System.out.println(aDVD);
		System.out.println(aBook);
		System.out.println(aFruit);
		System.out.println(aMedoc);
	}

	private static void runEx5() {
		List<ProgrammeTV> grilleDeProgTV = new ArrayList<>();
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
		}
	}

	private static void runEx6() {
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
