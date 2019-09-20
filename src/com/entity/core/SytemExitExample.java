package com.entity.core;

public class SytemExitExample {

	
	public static void main(String[] args) {
		
	
		try {
			int n = 10/0;
			
			//System.exit(0);
			return;
		}
		finally {
			System.out.println("finally block executed");
		}
		
		
	}
	
	
}
