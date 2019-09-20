package com.entity.string;

public class WordCount {
	
	public static void main(String[] args) {
		
		 String str = "This is an Example Of The Character";
	        System.out.println("Length Of String:" + str.length());
	        System.out.println("Length Of String Without a :" + str.replace("a", "").length());
	        int charcount = str.length() - str.replaceAll("a", "").length();
	        System.out.println("Occurrence Of A Char In String: " + charcount);
	        
	        String str1 = "      Geeks     for    Geeks        "; 
	        
	        // Call the replaceAll() method 
	        str1 = str1.replaceAll("\\s", ""); 
	       
	        System.out.println(str1); 

	}

}
