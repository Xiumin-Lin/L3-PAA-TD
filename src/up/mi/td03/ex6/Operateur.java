package up.mi.td03.ex6;

public abstract class Operateur {
	private int arite;

	protected Operateur(int arite) {
		this.arite = arite;
	}

	/**
	 * @return la valeur de cet opérateur pour ses opérandes.
	 */
	public abstract double evaluer();

	public void setArite(int arite) {
		this.arite = arite;
	}

	public int getArite() {
		return arite;
	}
}
