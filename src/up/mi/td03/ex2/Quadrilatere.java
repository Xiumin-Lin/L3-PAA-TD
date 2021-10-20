package up.mi.td03.ex2;

import up.mi.td02.ex2.Point;
import up.mi.td02.ex2.Vecteur;

import java.util.ArrayList;

public abstract class Quadrilatere extends Figure {
	private static int NB_SOMMETS = 4;
	private ArrayList<Point> sommets;

	protected Quadrilatere(Point a, Point b, Point c, Point d) {
		super();
		this.sommets = new ArrayList<>();
		sommets.add(a);
		sommets.add(b);
		sommets.add(c);
		sommets.add(d);
	}

	@Override
	public double perimeter() {
		double res = 0.0;
		for(int i = 0; i < NB_SOMMETS; i++)
			res += sommets.get(i).distance(sommets.get((i + 1) % NB_SOMMETS));
		return res;
	}

	@Override
	public Figure translation(Vecteur v) {
		for(Point p : sommets) p.translation(v);
		return this;
	}

	protected ArrayList<Point> getSommets() {
		return sommets;
	}
}
