package up.mi.td03.ex2;

import up.mi.td02.ex2.Point;

public class Losange extends Quadrilatere {

	public Losange(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
	}

	@Override
	public double surface() {
		double diag = getSommets().get(0).distance(getSommets().get(2));
		double diag2 = getSommets().get(1).distance(getSommets().get(3));
		return (diag * diag2) / 2;
	}
}
