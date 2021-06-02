package kalkulator;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCalc {

	@Test
	public void proveraKvadrat () {
		int a = 5;
		int povrsina = a * a;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Calc.pKvadrata(a), povrsina);
		sa.assertAll();
	}
	@Test
	public void proveraPravougaonik () {
		double a = 5;
		double b = 10;
		double povrsina = a * b;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Calc.pPravougaonika(a, b), povrsina);
		sa.assertAll();
	}
	@Test
	public void proveraKrug () {
		double r = 10;
		double povrsina = r * r * 3.14;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Calc.pKruga(r), povrsina);
		sa.assertAll();
		
	}
	
}
