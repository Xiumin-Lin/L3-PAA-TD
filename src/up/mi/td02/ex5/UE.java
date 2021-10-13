package up.mi.td02.ex5;

/**
 * Class d'unité d'enseignement
 */
public enum UE {
    ALGO("Algo", 1),
    PROG("Prog", 1),
    MATHS("Maths", 1),
    RESEAU("Reseau", 1);

    private String label;
    private int coeff;

    private UE(String label, int coeff) {
        this.label = label;
        this.coeff = coeff;
    }

    public String getLabel() {
        return label;
    }
}
