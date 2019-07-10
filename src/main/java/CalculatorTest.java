import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void Addition()
	{
		Calulator1 calculate = new Calulator1();
		int result = calculate.add(5,4);
		int expected = 9;
		assertEquals(result,expected,0);
	}
	@Test
	public void Subtraction()
	{
		Calulator1 calculate = new Calulator1();
		int result = calculate.subtract(5,4);
		int expected = 1;
		assertEquals(result,expected,0);
	}

}
