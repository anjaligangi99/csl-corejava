package com.entity.string;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDuplicateCharacter {
	
	public static void main(String[] args) {
		
		String string = "anjalianil";  
		/*
		 * int count;
		 * 
		 * char[] strArr = string.toCharArray(); for (int i = 0; i < strArr.length; i++)
		 * { count =1; for (int j = i+1; j < strArr.length; j++) {
		 * 
		 * if(strArr[i] == strArr[j] && strArr[i]!= ' ') { count++; strArr[j]='0'; }
		 * 
		 * }
		 * 
		 * if(count>1 && strArr[i]!='0') { System.out.print(strArr[i]+" "); } }
		 */
		
		char[] strArr = string.toCharArray();
		Map<Character,Integer> map = new HashMap();
		
		for (int i = 0; i < strArr.length; i++) {
			
			if (map.containsKey(strArr[i])) {
			   map.put(strArr[i], map.get(strArr[i])+1)	;
			}
			else {
				map.put(strArr[i], 1);
			}
		}
		/*
		 * Set<Map.Entry<Character, Integer>> entryMap =map.entrySet();
		 * 
		 * for (Entry<Character, Integer> entry : entryMap) { if(entry.getValue()>1) {
		 * System.out.print(entry.getKey()+" "); } }
		 */
		/*
		 * Stream<Entry<Character,Integer>> stream =
		 * map.entrySet().stream().filter(x->x.getValue()>1);
		 * 
		 * stream.forEach(entry->System.out.print(entry.getKey()+" "));
		 */
		map.entrySet().stream().filter(count->count.getValue() > 1).forEach(entry->System.out.print(entry.getKey()+" "));
	}

}
