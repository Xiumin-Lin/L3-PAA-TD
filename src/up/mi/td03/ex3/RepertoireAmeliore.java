package up.mi.td03.ex3;

import up.mi.td02.ex6.Personne;
import up.mi.td02.ex6.RepertoireSimple;

import java.util.Comparator;
import java.util.List;

public class RepertoireAmeliore extends RepertoireSimple {
	public static final String PROPRIO = "proprietaire";
	public static final String CONTACT = "contact";

	private Personne owner;

	public RepertoireAmeliore(Personne p) {
		super();
		this.owner = p;
	}

	public Personne getOwner() {
		return owner;
	}

	public String cherchePersonne(String tel) {
		if(this.owner.getTelNumber().equals(tel)) return owner.getFirstname() + " " + owner.getLastname();
		for(Personne p : getRepertoire()) {
			if(p.getTelNumber().equals(tel)) return p.getFirstname() + " " + p.getLastname();
		}
		return "Le numero " + tel + " n'appartient a personne.";
	}

	public String getStringForSave() {
		StringBuilder sb = new StringBuilder();
		sb.append(PROPRIO + "(").append(this.owner.getPersonneDataForSave()).append(")\n");
		for(Personne p : this.getRepertoire()) {
			sb.append(CONTACT + "(").append(p.getPersonneDataForSave()).append(")\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		List<Personne> cloneRep = getRepertoire();
		cloneRep.sort(Comparator.comparing(o -> (o.getLastname() + " " + o.getFirstname())));
		for(Personne p : cloneRep)
			sb.append(p.toString()).append('\n');
		return "Proprietaire : " + owner + '\n' + sb.toString();
	}
}
