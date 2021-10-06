package up.mi.td02;

import up.mi.td01.UtilMath;

public class Point {
    private double x;
    private double y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Calcul la distance entre deux points (xa, ya) & (xb, yb) : sqrt((xb - xa)^2 + (yb - ya)^2)
     * @param p le point d'arrivee
     * @return la distance
     */
    public double distance(Point p){
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }


}
