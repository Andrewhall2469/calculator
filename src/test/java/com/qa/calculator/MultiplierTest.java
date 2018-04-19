package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {
	
	private Multiplier multiplier;

	@Test
	public void test() {
		multiplier = new Multiplier();
		int expectedValue = 16;
		int actualValue = multiplier.multiply(4,4);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
