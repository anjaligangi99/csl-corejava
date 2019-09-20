package com.entity.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WordStartWithExamp {
	
	public static void main(String[] args) {
		String str = "James while John John had had had had had had had had had had had a better effect on the teacher";
		String stra[] =str.split("\\s");
		List<String> list =Arrays.asList(stra);
		
		 Set<String> set =new TreeSet<String>(list);
		 
		 for (String word : set) {
			 if(word.toLowerCase().startsWith("h")) {
			System.out.println(word+"  "+Collections.frequency(list, word));
			 }
			}
		 
		 System.out.println("using java 8");
		
		/*
		 * set.forEach(word->{ if(word.endsWith("n")) {
		 * System.out.println(word+"  "+Collections.frequency(list, word));} });
		 */
	      
		 set.forEach(word->{
			 if(word.endsWith("n"))
				 System.out.println(word+" "+Collections.frequency(list, word));
		 });
		
		
	}

}
