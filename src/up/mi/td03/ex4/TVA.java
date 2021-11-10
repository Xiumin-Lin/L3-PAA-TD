package up.mi.td03.ex4;

public enum TVA {
	NORMAL(20), INTERMEDIAIRE(10), REDUIT(5.5), PARTICULIER(2.1);
	private final double taux;

	TVA(double taux) {this.taux = taux;}

	/**
	 * @return le taux de tva en %
	 */
	public double getTaux() {
		return taux / 100;
	}
}
