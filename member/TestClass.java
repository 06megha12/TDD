package com.yash.TDD.member;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	MemberMain m = new MemberMain();
	//Member m = new Member();
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		String result=m.set();
		assertEquals(result, "Member [firstName=Pankaj Sharma, email=sharma.pankaj@yash.com, password=12345, role=Trainer]");
		
	}
}
