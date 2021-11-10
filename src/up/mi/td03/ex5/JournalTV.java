package up.mi.td03.ex5;

public class JournalTV extends ProgrammeTV{
	private String presentateur;

	public JournalTV(String presentateur, int heureDebut, int heurFin) {
		super("Journal TV", heureDebut, heurFin);
		this.presentateur = presentateur;
	}

	@Override
	public String toString() {
		return "(" + getHeureDebut() + ":00 - " + getHeureFin() +
				":00) '" + getTitre() + "' presente par " + presentateur;
	}
}
