package up.mi.td01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilMathTest {

	@Test
	void fact() {
		Assertions.assertEquals(1, UtilMath.fact(1));
		Assertions.assertEquals(6, UtilMath.fact(3));
		Assertions.assertEquals(3628800, UtilMath.fact(10));
	}

	@Test
	void factWithException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> UtilMath.fact(-1));
	}

	@Test
	void comb() {
		Assertions.assertEquals(120, UtilMath.comb(10, 3));
	}

	@Test
	void combWithException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> UtilMath.comb(2, 3));
	}
}