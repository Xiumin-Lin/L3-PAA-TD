package up.mi.td02.ex7;

import java.util.ArrayList;
import java.util.HashMap;

public class T9 {
	public static byte getChiffreT9(char c) {
		switch(Character.toLowerCase(c)) {
			case 'a':
			case 'b':
			case 'c':
				return 2;
			case 'd':
			case 'e':
			case 'f':
				return 3;
			case 'g':
			case 'h':
			case 'i':
				return 4;
			case 'j':
			case 'k':
			case 'l':
				return 5;
			case 'm':
			case 'n':
			case 'o':
				return 6;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				return 7;
			case 't':
			case 'u':
			case 'v':
				return 8;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				return 9;
			default:
				return 0;
		}
	}

	public static String stringInT9(String str) {
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			res.append(T9.getChiffreT9(str.charAt(i)));
		}
		return res.toString();
	}

	public static void enregistrer(HashMap<String, ArrayList<String>> dico, String chaineT9) {
		if(dico != null) {
			String key = T9.stringInT9(chaineT9);
			if(!dico.containsKey(key)) {
				ArrayList<String> value = new ArrayList<>();
				value.add(chaineT9);
				dico.put(key, value);
			} else dico.get(key).add(chaineT9);
		}
	}

	public static ArrayList<String> recuperer(HashMap<String, ArrayList<String>> dico, String chaineT9) {
		return dico.getOrDefault(chaineT9, new ArrayList<>());
	}

}
