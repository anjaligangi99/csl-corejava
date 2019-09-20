package com.entity.string;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String str = "anjali";
	     int mid = str.length()/2;
	        String sub1 = str.substring(0, mid);
	     String sub2 = str.substring(mid);
	      String str3 = "";
	      for (int i = sub2.length()-1; i >=0; i--) {
			str3 = str3+sub2.charAt(i);
		}
	     
	    //  sub1 = sub1+str3;
	      System.out.println(sub1+str3);
		
	}

}
