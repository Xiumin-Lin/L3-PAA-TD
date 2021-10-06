package up.mi.td01;

public class Tri {
    private Tri() {
    }

    /**
     * Si les elements du tableau t son tries entre iMin et iMilieu − 1
     * d’une part, et entre iMilieu et iMax d’autre part, la methode
     * modifie t pour qu’il soit trie entre iMin et iMax.
     *
     * @param t       le tableau a trier
     * @param iMin    indice min
     * @param iMilieu indice milieu
     * @param iMax    indice max
     * @throws Exception Jsais pas
     */
    public static void fusion(int[] t, int iMin, int iMilieu, int iMax) throws Exception {
        int[] tmpTab = new int[iMax + 1 - iMin];
        int cpt1 = iMin;
        int cpt2 = iMilieu;
        for(int i = 0; i < tmpTab.length; i++) {
            if(cpt1 >= iMilieu || cpt2 <= iMax && t[cpt1] > t[cpt2]) {
                tmpTab[i] = t[cpt2];
                cpt2++;
            } else if(cpt2 > iMax || t[cpt1] <= t[cpt2]) {
                tmpTab[i] = t[cpt1];
                cpt1++;
            } else throw new Exception("Errrrr");
        }
        if(iMax + 1 - iMin >= 0) System.arraycopy(tmpTab, iMin, t, iMin, iMax + 1 - iMin);
    }

    /**
     * Trie par fusion les elements de t entre les indices iMin et iMax
     *
     * @param t    le tableau a trier
     * @param iMin indice min
     * @param iMax indice max
     */
    public static void triFusion(int[] t, int iMin, int iMax) {
        // TODO
    }
}
