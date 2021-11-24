package up.mi.td04.ex4;

import up.mi.td03.ex3.RepertoireAmeliore;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SauvegardeRepertoire {

	public static void save(RepertoireAmeliore rep, String file) {
		try(PrintWriter pW = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
			pW.println(rep.getStringForSave());
			System.out.println("Save successful !");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
