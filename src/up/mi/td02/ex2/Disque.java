package up.mi.td02.ex2;

public class Disque {
    private Point center;
    private double rayon;

    public Disque(Point p, double r) {
        this.center = p;
        this.rayon = r;
    }

    /**
     * Verifie si un point est contenu dans le disque
     *
     * @param p le point a tester
     * @return true si le point p est contenu dans le disque
     */
    public boolean contains(Point p) {
        return this.center.distance(p) <= this.rayon;
    }

    /**
     * Verifie si le disque intersecte avec le disque donne
     *
     * @param d le disque a tester
     * @return true si il y a intersection sinon false
     */
    public boolean intersect(Disque d) {
        return this.center.distance(d.center) <= (this.rayon + d.rayon);
    }

    /**
     * Translation du disque par un vecteur donne
     *
     * @param v le vecteur de la translation
     */
    public void translation(Vecteur v) {
        this.center = this.center.translation(v);
    }

    @Override
    public String toString() {
        return "Disque{" + "center= " + center + ", rayon= " + rayon + '}';
    }
}
