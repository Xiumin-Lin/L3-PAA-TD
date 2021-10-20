package up.mi.td03.ex2;

import up.mi.td02.ex2.Point;
import up.mi.td02.ex2.Vecteur;

public class Disque extends Figure {
	private Point center;
	private double rayon;

	public Disque(Point point, int rayon) {
		this.center = point;
		this.rayon = rayon;
	}

	@Override
	public double perimeter() {
		return rayon * 2 * Math.PI;
	}

	@Override
	public double surface() {
		return Math.PI * rayon * rayon;
	}

	@Override
	public Figure translation(Vecteur v) {
		this.center = this.center.translation(v);
		return this;
	}
}
