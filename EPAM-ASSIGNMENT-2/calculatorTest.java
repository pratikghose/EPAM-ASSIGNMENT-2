package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorTest {

	calculator obj=new calculator();
	@Test
	void testAdd() {
		assertEquals(20, obj.add(10,10));
		assertEquals(98, obj.add(90,8));
		assertEquals(27, obj.add(21,6));
	}
	@Test
	void testMultiply()
	{
		assertEquals(90, obj.multiply(9,10));
		assertEquals(0, obj.multiply(0,139));
		
	}
	@Test
	void testDivide()
	{
		assertEquals(1.0, obj.divide(5,5));
		assertEquals(5.0, obj.divide(25,5));
		assertEquals(5.0, obj.divide(-25,-5));
		Assertions.assertThrows(ArithmeticException.class,()->obj.divide(25, 0));
	}

}
