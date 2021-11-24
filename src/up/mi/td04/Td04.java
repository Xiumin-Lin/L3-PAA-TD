package up.mi.td04;

import up.mi.td01.UtilMath;
import up.mi.td02.ex6.Personne;
import up.mi.td03.ex3.RepertoireAmeliore;
import up.mi.td04.ex2and3.UnixCMD;
import up.mi.td04.ex4.ParserRepertoire;
import up.mi.td04.ex4.SauvegardeRepertoire;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Td04 {
	public static void runTd(String[] args) {
//		runEx1();
//		runEx2And3(args);
		runEx4();
	}

	private static void runEx1() {
		try {
			System.out.println("fact(-5) = " + UtilMath.fact(-5));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("comb(1,3) = " + UtilMath.comb(1, 3));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("2^-5 = " + UtilMath.power(2, -5));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		UtilMath.showMathInterface();
	}

	private static void runEx2And3(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		try {
			System.out.println("Choix :");
			System.out.println("1. du -h f  ile");
			System.out.println("2. cp file1 file2");
			System.out.println("3. grep file str");
			System.out.println("4. wc file");
			System.out.println("0. exit");
			System.out.print(">>>");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					if(args.length != 1)
						throw new Exception("Nombre d'argument incorrect, verifie qu'il y a bien 1 seul nom de fichier.");
					System.out.print("Affiche la taille d'un fichier en octet :\n\t");
					UnixCMD.duH(args[0]);
					break;
				case 2:
					if(args.length != 2)
						throw new Exception("Nombre d'argument incorrect, verifie qu'il y a bien 2 noms de fichier.");
					System.out.println("Copie le fichier " + args[0] + " dans le fichier " + args[1]);
					UnixCMD.cp(args[0], args[1]);
					break;
				case 3:
					break;
				case 0:
					System.out.println("Exit !");
					break;
				default:
					throw new IllegalArgumentException("Choix invalide !");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		System.out.println("Fin du programme !");
	}

	private static void runEx4() {
		Scanner sc = new Scanner(System.in);
		RepertoireAmeliore rep = null;
		boolean isEnd = false;
		do {
			System.out.println("\n(1) Create a directory.");
			System.out.println("(2) Add contact in the directory.");
			System.out.println("(3) Search in the directory.");
			System.out.println("(4) Show directory.");
			System.out.println("(5) Save directory.");
			System.out.println("(6) Load directory.");
			System.out.println("(0) exit");
			System.out.print(">>>");
			try {
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case 1: // create
						System.out.print("Enter your firstname, lastname & phone number please (Ex: Amy,San,0123456789) : ");
						String s = sc.nextLine();
						String[] data = s.split(",");
						rep = new RepertoireAmeliore(new Personne(data[0], data[1], data[2]));
						System.out.println("Creation successful !");
						break;
					case 2: // add
						if(rep == null) throw new Exception("[Error] The directory is not created !");
						System.out.print("Enter the contact's info to add (Ex: Jack,Per,0198765432) :");
						String s2 = sc.nextLine();
						String[] data2 = s2.split(",");
						rep.addPersonne(data2[0], data2[1], data2[2]);
						break;
					case 3: // find
						if(rep == null) throw new Exception("[Error] The directory is not created !");
						System.out.print("Enter the phone numer of the person to find :");
						System.out.println(rep.cherchePersonne(sc.nextLine()));
						break;
					case 4: // show rep
						if(rep == null) throw new Exception("[Error] The directory is not created !");
						System.out.println(rep);
						break;
					case 5: // save
						if(rep == null) throw new Exception("[Error] The directory is not created !");
						System.out.print("Enter the name of the backup file (Ex: data.txt) : ");
						String fileName = sc.nextLine();
						SauvegardeRepertoire.save(rep, fileName);
						break;
					case 6: // load
						System.out.print("Enter the file's name to load (Ex: data.txt) : ");
						if(rep != null) System.out.println("The old directory will be delete.");
						rep = ParserRepertoire.parser(sc.nextLine());
						break;
					case 0:
						System.out.println("End of the program.");
						isEnd = true;
						break;
					default:
						System.out.println("[Error] Invalid Input !");
				}
			} catch(InputMismatchException e) {
				System.out.println("[Error] A Interger please !");
				sc.nextLine();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		} while(!isEnd);
		sc.close();
	}
}
