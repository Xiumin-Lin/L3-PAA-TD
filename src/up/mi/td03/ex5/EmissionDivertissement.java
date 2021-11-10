package up.mi.td03.ex5;

public class EmissionDivertissement extends ProgrammeTV {
	private static final int DUREE = 2; // heure
	private String presentateur;

	public EmissionDivertissement(String titre, int heureDebut, String presentateur) {
		super(titre, heureDebut, heureDebut + DUREE);
		this.presentateur = presentateur;
	}

	@Override
	public String toString() {
		return "(" + getHeureDebut() + ":00 - " + getHeureFin() +
				":00) Emission '" + getTitre() + "' presente par " + presentateur;
	}
}
