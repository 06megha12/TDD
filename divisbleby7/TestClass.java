package com.yash.TDD.divisbleby7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	DivisibleBy7 d=new DivisibleBy7();
	@Test
	public void test_DivisibleBy7_Right() {
		assertEquals(d.add(), 500);
	}
	
	@Test
	public void test_DivisibleBy7_Wrong() {
		assertEquals(d.add(), 2107);
	}
}
