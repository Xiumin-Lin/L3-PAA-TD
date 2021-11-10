package up.mi.td03.ex6;

import up.mi.td01.UtilMath;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationNAire extends Operateur {
	private List<Operateur> operateurList;

	public MultiplicationNAire() {
		super(0);
		operateurList = new ArrayList<>();
	}

	public void ajouterOperateur(Operateur op) {
		this.operateurList.add(op);
		this.setArite(getArite() + 1);
	}

	@Override
	public double evaluer() {
		double res = 1;
		for(Operateur op : operateurList) {
			res *= op.evaluer();
		}
		return UtilMath.round2Decimal(res);
	}
}
