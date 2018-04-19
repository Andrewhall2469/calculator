package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest {

	private Divider divider;

	@Test
	public void test() {
		divider = new Divider();
		int expectedValue = 3;
		int actualValue = divider.divide(9,3);
		Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void zerotest() {
		divider = new Divider();
		int expectedValue = 0;
		int actualValue = divider.divide(9,0);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
