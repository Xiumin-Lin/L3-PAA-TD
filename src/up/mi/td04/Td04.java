package up.mi.td04;

import up.mi.td01.UtilMath;

public class Td04 {
	public static void runTd() {
		runEx1();
	}

	private static void runEx1() {
		try {
			System.out.println("fact(-5) = " + UtilMath.fact(-5));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("comb(1,3) = " + UtilMath.comb(1, 3));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("2^-5 = " + UtilMath.power(2, -5));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		UtilMath.showMathInterface();
	}
}
