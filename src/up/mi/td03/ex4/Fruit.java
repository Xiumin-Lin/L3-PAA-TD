package up.mi.td03.ex4;

public class Fruit extends Produit {
	private String paysOrigine;

	/**
	 * @param nom   nom du produit
	 * @param pHT prix hors taxe
	 * @param pO  le pays d'origine
	 */
	public Fruit(String nom, double pHT, String pO) {
		super(nom, pHT, TVA.REDUIT);
		this.paysOrigine = pO;
	}
}
