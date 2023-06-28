package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.maven.study.SumCalculator;

class SumCalculatorTest {
	private SumCalculator calculator;

	@BeforeEach
	public void beforeEach(){
		calculator = new SumCalculator();
	}

	@Test
	void testIsSumIs1() {
		int actual = calculator.sum(1);
		int expected = 1;
		Assertions.assertEquals(expected,actual);
	}
	@Test
	void testIsSumIs6() {
		int actual = calculator.sum(3);
		int expected = 6;
		Assertions.assertEquals(expected,actual);
	}
	@Test
	void testIsSumIsExceptionsWhenEqualse0() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{ new SumCalculator().sum(0);});
	}

}