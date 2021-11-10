package up.mi.td03.ex5;

public abstract class ProgrammeTV {
	private String titre;
	private int heureDebut;
	private int heureFin;

	protected ProgrammeTV(String titre, int heureDebut, int heurFin){
		assert heureDebut >= 0 && heureDebut < 24 && heurFin >= 0 && heurFin < 24;
		this.titre = titre;
		this.heureDebut = heureDebut;
		this.heureFin = heurFin;
	}

	public String getTitre() {
		return titre;
	}

	public int getHeureDebut() {
		return heureDebut;
	}

	public int getHeureFin() {
		return heureFin;
	}
}
