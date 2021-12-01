package up.mi.td02.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RepertoireSimpleTest {
	private RepertoireSimple rep;
	private static RepertoireSimple repTest;
	private static Personne p1;
	private static Personne p2;

	@BeforeAll
	static void init() {
		repTest = new RepertoireSimple();
		p1 = new Personne("Amy", "Yma", "0123456789");
		p2 = new Personne("Bobby", "Bob", "0198765432");
		repTest.addPersonne(p1);
		repTest.addPersonne(p2);
	}

	@BeforeEach
	void setUp() {
		rep = new RepertoireSimple();
	}

	@Test
	void getRepertoire() {
		Assertions.assertTrue(rep.getRepertoire().isEmpty());

		List<Personne> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		Assertions.assertIterableEquals(list, repTest.getRepertoire());
	}

	@Test
	void addPersonne() {
		rep.addPersonne(p1);
		rep.addPersonne(p2);
		Assertions.assertTrue(rep.getRepertoire().contains(p1));
		Assertions.assertTrue(rep.getRepertoire().contains(p2));
	}

	@Test
	void addPersonneManually() {
		Personne p = new Personne("Elly", "Zabet", "0612345789");
		rep.addPersonne(p);
		Assertions.assertEquals("Elly", rep.getRepertoire().get(0).getFirstname());
		Assertions.assertEquals("Zabet", rep.getRepertoire().get(0).getLastname());
		Assertions.assertEquals("0612345789", rep.getRepertoire().get(0).getTelNumber());
	}

	@Test
	void chercheNumero() {
		Assertions.assertEquals("0123456789", repTest.chercheNumero(p1.getFirstname(), p1.getLastname()));
		Assertions.assertEquals("0198765432", repTest.chercheNumero(p2.getFirstname(), p2.getLastname()));
	}

	@Test
	void chercheNumeroInconnu() {
		Assertions.assertEquals("Le repertoire est vide !", rep.chercheNumero(p1.getFirstname(), p1.getLastname()));
		Assertions.assertEquals("L'identite UnknownP NULL est inconnue.", repTest.chercheNumero("UnknownP", "NULL"));
	}
}