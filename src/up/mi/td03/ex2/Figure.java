package up.mi.td03.ex2;

import up.mi.td02.ex2.Vecteur;

public abstract class Figure {
	public abstract double perimeter();
	public abstract double surface();
	public abstract Figure translation(Vecteur v);

	@Override
	public String toString() {
		return this.getClass() + " : perimetre = " + perimeter() + "; surface = " + surface();
	}
}
