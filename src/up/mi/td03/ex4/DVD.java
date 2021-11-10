package up.mi.td03.ex4;

public class DVD extends Produit{
	private String realisateur;
	/**
	 * @param titre titre du dvd
	 * @param pHT   prix hors taxe
	 * @param real  le nom du realisateur
	 */
	public DVD(String titre, double pHT, String real) {
		super(titre, pHT, TVA.NORMAL);
		this.realisateur = real;
	}
}
