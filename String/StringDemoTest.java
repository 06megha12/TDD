package com.yash.TDD.String;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringDemoTest {

Main m = new Main();
	
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		String result=m.setinput();
		assertEquals(result, "StringDemo [input=Java Test]");
		
	}
}
