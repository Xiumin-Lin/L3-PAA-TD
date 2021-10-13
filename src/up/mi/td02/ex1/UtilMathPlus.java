package up.mi.td02.ex1;

import up.mi.jgm.maths.Complexe;
import up.mi.jgm.maths.Rationnel;

public class UtilMathPlus {
    private UtilMathPlus() {
    }

    /**
     * Calcul la puissance n d'un rationnel
     *
     * @param r le rationnel
     * @param n la puissance
     * @return le rationnel puissance n
     */
    public static Rationnel powRationnel(Rationnel r, int n) {
        Rationnel res = new Rationnel(1, 1);
        for(int i = 0; i < n; i++) {
            res = res.multiplication(r);
        }
        return res;
    }

    /**
     * Somme de deux nombres complexes : a+i×b et c+i×d est (a+c) + i×(b+d).
     *
     * @param a nombre complexe
     * @param c nb complexe
     * @return somme des deux nb complexes
     */
    public static Complexe sommeComplexe(Complexe a, Complexe c) {
        return new Complexe(a.getPartieReelle() + c.getPartieReelle(),
                a.getPartieImaginaire() + c.getPartieImaginaire());
    }

    /**
     * Produit de deux nombres complexes : a+i×b et c+i×d est (a×c − b×d) + i×(a×d + b×c)
     *
     * @param a nb complexe
     * @param c nb complexe
     * @return produit des deux nb complexes
     */
    public static Complexe produitComplexe(Complexe a, Complexe c) {
        double partReelle = a.getPartieReelle() * c.getPartieReelle() - a.getPartieImaginaire() * c.getPartieImaginaire();
        double partImag = a.getPartieReelle() * c.getPartieImaginaire() + a.getPartieImaginaire() * c.getPartieReelle();
        return new Complexe(partReelle, partImag);
    }
}
