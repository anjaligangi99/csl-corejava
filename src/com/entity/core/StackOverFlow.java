package com.entity.core;

public class StackOverFlow {
	
	public static void main(String[] args) {
	
		
		recursive(1);
	}

	
	public static void recursive(int num) {
		System.out.println(num);
		
			recursive(++num);
	}
}
