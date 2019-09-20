package com.entity.core;

import java.util.LinkedHashMap;
import java.util.function.BiConsumer;

public class LinkedHashMapDemo {
	
	private static final BiConsumer<? super Integer, ? super String> Integer = null;

	public static void main(String[] args) {
		java.util.LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Anjali");
		map.put(2, "Suma");
		map.put(3,"Mounika");
		
		
		map.forEach((key,value)->{
			System.out.println("key"+key+"  "+  "val"+value);
		});
	}

}
