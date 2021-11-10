package up.mi.td03.ex6;

public class Valeur extends Operateur {
	private double nombre;
	public Valeur(double n) {
		super(0);
		this.nombre = n;
	}

	@Override
	public double evaluer() {
		return nombre;
	}
}
