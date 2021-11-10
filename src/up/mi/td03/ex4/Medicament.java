package up.mi.td03.ex4;

public class Medicament extends Produit {
	private String laboratoire;
	private int nbComprimes;

	/**
	 * @param nom         nom du produit
	 * @param pHT         prix hors taxe
	 * @param labo        nom du laboratoire
	 * @param nbComprimes nombre de comprimés dans le medicament
	 */
	public Medicament(String nom, double pHT, String labo, int nbComprimes) {
		super(nom, pHT, TVA.PARTICULIER);
		this.laboratoire = labo;
		this.nbComprimes = nbComprimes;
	}
}
