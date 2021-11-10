package up.mi.td03.ex5;

public class Fiction extends ProgrammeTV {
	private String realisateur;
	private Boolean isRediff;

	public Fiction(String titre, int heureDebut, int heurFin, String real, Boolean isRediff) {
		super(titre, heureDebut, heurFin);
		this.realisateur = real;
		this.isRediff = isRediff;
	}

	@Override
	public String toString() {
		String rediffText = Boolean.TRUE.equals(isRediff) ? " (Rediff)" : "";
		return "(" + getHeureDebut() + ":00 - " + getHeureFin() +
				":00) Fiction '" + getTitre() + "' realise par " + realisateur + rediffText;
	}
}
