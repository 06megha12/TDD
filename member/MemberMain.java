package com.yash.TDD.member;

public class MemberMain {

	public static String set() {
		Member m = new Member();
		m.setFirstName("Pankaj");
		m.setLastName("Sharma");
		m.setEmail("sharma.pankaj@yash.com");
		m.setPassword("12345");
		m.setRole("Trainer");
		return m.showMemberDetail();
	}
}
