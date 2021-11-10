package up.mi.td03.ex5;

public class Reportage extends ProgrammeTV{
	private ThemeTV theme;
	public Reportage(String titre,int heureDebut, int heurFin, ThemeTV theme) {
		super(titre, heureDebut, heurFin);
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "(" + getHeureDebut() + ":00 - " + getHeureFin() +
				":00) Reportage '" + getTitre() + "' - " + theme;
	}
}
