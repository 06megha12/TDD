package com.yash.TDD.programs;

public class ConsecutiveNumber01 {

	/*
	 * public static void main(String[] args) {
	 * 
	 * ConsecutiveNumber cn=new ConsecutiveNumber();
	 * 
	 * System.out.println(cn.add(1, 10));
	 * 
	 * }
	 */
	public int add(int start , int end) {
		
		int sum=0;
		for (int i = start; i <= end; i++) {
			sum=sum+i;
		}
		return sum;
	}

}
