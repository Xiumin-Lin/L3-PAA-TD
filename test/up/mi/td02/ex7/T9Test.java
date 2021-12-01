package up.mi.td02.ex7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class T9Test {
	private HashMap<String, ArrayList<String>> dico;
	private static HashMap<String, ArrayList<String>> dico2;
	private static HashMap<String, ArrayList<String>> dicoTest;

	@BeforeAll
	static void init() {
		dico2 = new HashMap<>();
		T9.enregistrer(dico2, "bonne");
		T9.enregistrer(dico2, "comme");
		dicoTest = new HashMap<>();
		T9.enregistrer(dicoTest, "bonjour");
		T9.enregistrer(dicoTest, "bonne");
		T9.enregistrer(dicoTest, "comme");
	}

	@BeforeEach
	void setUp() {
		dico = new HashMap<>();
	}

	@Test
	void initTest() {
		List<String> l = new ArrayList<>();
		l.add("bonne");
		l.add("comme");
		Assertions.assertIterableEquals(l, dico2.get("26663"));
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
		Assertions.assertTrue(dico.containsKey(T9.stringInT9("bonjour")));

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
		Assertions.assertEquals(1, T9.recuperer(dicoTest, "2665687").size());
		Assertions.assertEquals("bonjour", T9.recuperer(dicoTest, "2665687").get(0));

		// string with same T9 string
		Assertions.assertEquals(2, T9.recuperer(dico2, "26663").size());
		Assertions.assertEquals("comme", T9.recuperer(dico2, "26663").get(1));

		// unknown string
		Assertions.assertTrue(T9.recuperer(dico, "123").isEmpty());
	}

	@ParameterizedTest
	@CsvSource({"bonjour, 2665687", "comme, 26663", "bonne, 26663"})
	void recupWithParameter(String str, String strInT9) {
		Assertions.assertTrue(dicoTest.containsKey(strInT9));
		Assertions.assertTrue(dicoTest.get(strInT9).contains(str));
	}
}