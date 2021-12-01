package up.mi.td02.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class T9Test {
	HashMap<String, ArrayList<String>> dico;

	@BeforeEach
	void setUp() {
		dico = new HashMap<>();
	}

	@Test
	void getChiffreT9() {
		Assertions.assertEquals(2, T9.getChiffreT9('a'));
		Assertions.assertEquals(3, T9.getChiffreT9('e'));
		Assertions.assertEquals(4, T9.getChiffreT9('i'));
		Assertions.assertEquals(4, T9.getChiffreT9('i'));
		Assertions.assertEquals(5, T9.getChiffreT9('k'));
		Assertions.assertEquals(6, T9.getChiffreT9('o'));
		Assertions.assertEquals(7, T9.getChiffreT9('s'));
		Assertions.assertEquals(8, T9.getChiffreT9('t'));
		Assertions.assertEquals(9, T9.getChiffreT9('x'));
		Assertions.assertEquals(0, T9.getChiffreT9('*'));
		Assertions.assertEquals(0, T9.getChiffreT9('!'));
	}

	@Test
	void stringInT9() {
		Assertions.assertEquals("44", T9.stringInT9("hi"));
		Assertions.assertEquals("2665687", T9.stringInT9("bonjour"));
	}

	@Test
	void enregistrer() {
		T9.enregistrer(dico, "bonjour");
		Assertions.assertEquals(1, dico.size());

		String str2 = "bonne";
		T9.enregistrer(dico, str2);
		Assertions.assertEquals(2, dico.size());
		Assertions.assertEquals(1, dico.get(T9.stringInT9(str2)).size());

		T9.enregistrer(dico, "comme");
		Assertions.assertEquals(2, dico.size());
		Assertions.assertEquals(2, dico.get(T9.stringInT9(str2)).size());
	}

	@Test
	void recuperer() {
		T9.enregistrer(dico, "bonjour");
		Assertions.assertEquals(1, T9.recuperer(dico, "2665687").size());
		Assertions.assertEquals("bonjour", T9.recuperer(dico, "2665687").get(0));

		// string with same T9 string
		T9.enregistrer(dico, "bonne");
		T9.enregistrer(dico, "comme");
		Assertions.assertEquals(2, T9.recuperer(dico, "26663").size());
		Assertions.assertEquals("comme", T9.recuperer(dico, "26663").get(1));

		// unknown string
		Assertions.assertTrue(T9.recuperer(dico, "123").isEmpty());
	}
}