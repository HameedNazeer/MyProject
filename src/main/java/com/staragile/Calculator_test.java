package com.staragile;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class Calculator_test{

	@Test
	public void testadd() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.add(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0, calculator.sub(2, 2));
	}

	@Test
	public void testdiv() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.div(6, 3));
	
	}
	
	@Test
	public void testmul() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.mul(2, 1));
}
}