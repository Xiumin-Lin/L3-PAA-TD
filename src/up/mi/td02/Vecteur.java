package up.mi.td02;

public class Vecteur {
    private Point start;
    private Point end;

    public Vecteur(Point a, Point b) {
        this.start = a;
        this.end = b;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Vecteur)) return false;
        if(o == this) return true;
        Vecteur v = (Vecteur) o;
        return this.end.getX() - this.start.getX() == v.end.getX() - v.start.getX()
                && this.end.getY() - this.start.getY() == v.end.getY() - v.start.getY();
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Vecteur{" + "a= " + start + ", b= " + end + '}';
    }
}
