package com.yash.TDD.document;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	StringDocument d = new StringDocument();
	
	@Test
    public void ShouldReturn_String_through_method() {
        String result=MainClass.set();
        assertEquals(result, "java basics , c:/document/corejava/basics/introduction.pdf");
        
    }
}
