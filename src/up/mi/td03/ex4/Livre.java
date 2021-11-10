package up.mi.td03.ex4;

public class Livre extends Produit {
	private String auteur;
	private String ISBN;

	/**
	 * @param titre  nom du produit
	 * @param pHT    prix hors taxe
	 * @param auteur taux de TVA
	 * @param ISBN   International Standard Book Number
	 */
	public Livre(String titre, double pHT, String auteur, String ISBN) {
		super(titre, pHT, TVA.REDUIT);
		this.auteur = auteur;
		this.ISBN = ISBN;
	}
}
