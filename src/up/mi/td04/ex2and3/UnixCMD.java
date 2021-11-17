package up.mi.td04.ex2and3;

import java.io.*;

public class UnixCMD {
	/**
	 * Copy the content of the fileStart in fileDest
	 *
	 * @param fileStartName the file to be copied
	 * @param fileDestName  the destination file
	 */
	public static void cp(String fileStartName, String fileDestName) {
		String line;
		try(
				FileReader fStart = new FileReader(fileStartName);
				BufferedReader bR = new BufferedReader(fStart);
				FileWriter fDest = new FileWriter(fileDestName);
				BufferedWriter bW = new BufferedWriter(fDest);
				PrintWriter pW = new PrintWriter(bW)
		) {
			while((line = bR.readLine()) != null) {
				pW.println(line);
			}
			System.out.println("Copy Succesful !");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Display the size in bytes of the file given in parameter
	 *
	 * @param fileName the file's name
	 */
	public static void duH(String fileName) {
		File f = new File(fileName);
		if(f.exists())
			System.out.println("Le fichier " + fileName + " a une taille de " + f.length() + " octets.");
		System.out.println("Le fichier " + fileName + " est introuvable !");
	}

	public static void grep(String fileName, String regex) {

	}

	public static void wc(String fileName) {

	}
}
