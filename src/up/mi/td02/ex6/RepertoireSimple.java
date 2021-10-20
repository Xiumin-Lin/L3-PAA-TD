package up.mi.td02.ex6;

import java.util.ArrayList;

public class RepertoireSimple {
	private ArrayList<Personne> repertoire;

	public RepertoireSimple() {
		this.repertoire = new ArrayList<>();
	}

	public void addPersonne(String firstname, String lastname, String telNumber) {
		this.repertoire.add(new Personne(firstname, lastname, telNumber));
	}

	public String chercheNumero(String firstname, String lastname) {
		for(Personne p : repertoire) {
			if(p.getFirstname().equals(firstname) && p.getLastname().equals(lastname)) return p.getTelNumber();
		}
		return "L'identite " + firstname + " " + lastname + " est inconnue.";
	}
}
