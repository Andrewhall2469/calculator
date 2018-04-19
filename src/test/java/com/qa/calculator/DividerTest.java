package com.qa.calculator;

import static org.junit.Assert.*;

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
}
