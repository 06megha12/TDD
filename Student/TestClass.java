package com.yash.TDD.Student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		int count=Student.counting();
		assertEquals(count, 3);
		
	}
}
