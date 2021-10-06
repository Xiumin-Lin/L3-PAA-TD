package up.mi.td02;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calcul la distance entre deux points (xa, ya) & (xb, yb) : sqrt((xb - xa)^2 + (yb - ya)^2)
     *
     * @param p le point d'arrivee
     * @return la distance
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    /**
     * Retourne un point correspondant a la translation (deplacement) du point initial
     * dans la direction et la distance representees par un vecteur
     *
     * @param v le vecteur de la translation
     * @return le nouveau point issu de la translation
     */
    public Point translation(Vecteur v) {
        double newX = v.getEnd().x - v.getStart().x + this.x;
        double newY = v.getEnd().y - v.getStart().y + this.y;
        return new Point(newX, newY);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
