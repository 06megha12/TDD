package com.yash.TDD.document;

public class MainClass {

	public static void main(String args[]) {
		
	}
	public static String set() {
		StringDocument d = new StringDocument();
        d.setTitle("java basics");
        d.setFilepath("c:/document/corejava/basics/introduction.pdf");
        System.out.println( d.showDocumentInformation());
        return d.showDocumentInformation();
        
        
    }
}
