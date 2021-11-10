package up.mi.td03.ex4;

public abstract class Produit {
	private String label;
	private double prixHT;
	private TVA tva;

	/**
	 * @param l   nom du produit
	 * @param pHT prix hors taxe
	 * @param t   taux de TVA
	 */
	protected Produit(String l, double pHT, TVA t) {
		this.label = l;
		this.prixHT = pHT;
		this.tva = t;
	}

	public final double getPrixTTC() {
		double pTTC = prixHT * (1 + tva.getTaux());
		return Math.round(pTTC * 100) / 100.0; // prix arrondi a 2 decimal près
	}

	@Override
	public String toString() {
		return "Le " + getClass().getSimpleName() + " '" + label + "' coute " + getPrixTTC() + " euros TTC.";
	}
}
