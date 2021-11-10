package up.mi.td03.ex3;

import up.mi.td02.ex6.Personne;
import up.mi.td02.ex6.RepertoireSimple;

import java.util.Comparator;
import java.util.List;

public class RepertoireAmeliore extends RepertoireSimple {
	private Personne owner;

	public RepertoireAmeliore(Personne p) {
		super();
		this.owner = p;
	}

	public String cherchePersonne(String tel) {

		for(Personne p : getRepertoire())
			if(p.getTelNumber().equals(tel)) return p.getFirstname() + " " + p.getLastname();
		return "Le numero " + tel + "n'appartient a personne.";
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
