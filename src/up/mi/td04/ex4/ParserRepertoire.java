package up.mi.td04.ex4;

import up.mi.td02.ex6.Personne;
import up.mi.td03.ex3.RepertoireAmeliore;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParserRepertoire {

	private static Personne createPersonne(String line) throws ArrayIndexOutOfBoundsException {
		try {
			String recup = line.split("\\(")[1].split("\\)")[0];
			String[] data = recup.split(",");
			return new Personne(data[0], data[1], data[2]);
		} catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Personne Data is incomplete : " + line);
		}
	}

	public static RepertoireAmeliore parser(String file) {
		RepertoireAmeliore rep = null;
		Personne proprio = null;
		try(BufferedReader bR = new BufferedReader(new FileReader(file))) {
			String line = "";
			while((line = bR.readLine()) != null) {
				if(line.startsWith(RepertoireAmeliore.PROPRIO)) {
					if(proprio != null) throw new Exception("[Error] The owner is already created !");
					proprio = createPersonne(line);
					rep = new RepertoireAmeliore(proprio);
				} else if(line.startsWith(RepertoireAmeliore.CONTACT)) {
					if(rep != null) {
						Personne p = createPersonne(line);
						rep.addPersonne(p);
					} else throw new Exception("[Error] Repetoire doesn't exist !");
				}
			}
			System.out.println("Parser successful !");
		} catch(FileNotFoundException e) {
			System.out.println("[Error] File Not Found, " + e.getMessage());
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return rep;
	}
}
