package up.mi.td02.ex6;

import java.util.ArrayList;
import java.util.List;

public class RepertoireSimple {
	private ArrayList<Personne> repertoire;

	public RepertoireSimple() {
		this.repertoire = new ArrayList<>();
	}

	public void addPersonne(Personne p) {
		this.repertoire.add(p);
	}

	public void addPersonne(String firstname, String lastname, String telNumber) {
		this.repertoire.add(new Personne(firstname, lastname, telNumber));
	}

	public String chercheNumero(String firstname, String lastname) {
		if(repertoire.isEmpty()) return "Le repertoire est vide !";
		for(Personne p : repertoire) {
			if(p.getFirstname().equals(firstname) && p.getLastname().equals(lastname)) return p.getTelNumber();
		}
		return "L'identite " + firstname + " " + lastname + " est inconnue.";
	}

	public List<Personne> getRepertoire() {
		return new ArrayList<>(repertoire);
	}
}
