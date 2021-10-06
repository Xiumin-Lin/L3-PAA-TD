package up.mi.td02;

public class Disque {
    private Point center;
    private double rayon;

    public Disque(Point p, double r) {
        this.center = p;
        this.rayon = r;
    }

    /**
     * Verifie si un point est contenu dans le disque
     * @param p le point a tester
     * @return true si le point p est contenu dans le disque
     */
    public boolean contains(Point p) {
        return this.center.distance(p) <= this.rayon;
    }

    /**
     * Verifie si le disque intersecte avec le disque donnee
     * @param d le disque a tester
     * @return true si il y a intersection sinon false
     */
    public boolean intersect(Disque d) {
        return this.center.distance(d.center) <= (this.rayon + d.rayon);
    }
}
