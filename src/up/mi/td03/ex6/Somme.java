package up.mi.td03.ex6;

import up.mi.td01.UtilMath;

public class Somme extends Operateur {
	public Operateur op1;
	public Operateur op2;

	public Somme(Operateur op1, Operateur op2) {
		super(2);
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public double evaluer() {
		return UtilMath.round2Decimal(op1.evaluer() + op2.evaluer());
	}
}
