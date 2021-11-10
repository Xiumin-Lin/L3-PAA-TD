package up.mi.td03.ex6;

import up.mi.td01.UtilMath;

import java.util.ArrayList;
import java.util.List;

public class AdditionNAire extends Operateur {
	private List<Operateur> operateurList;

	public AdditionNAire() {
		super(0);
		operateurList = new ArrayList<>();
	}

	public void ajouterOperateur(Operateur op) {
		this.operateurList.add(op);
		this.setArite(getArite() + 1);
	}

	@Override
	public double evaluer() {
		double res = 0;
		for(Operateur op : operateurList) {
			res += op.evaluer();
		}
		return UtilMath.round2Decimal(res);
	}
}
