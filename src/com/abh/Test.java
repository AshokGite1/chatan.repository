package com.abh;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		String str = "India is my country I love my country";// in
		
		Map<String, Long> countword = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Optional<Entry<String, Long>> max = countword.entrySet().stream().max(Map.Entry.comparingByValue());
		System.out.println(max.get());
		
		//Arrays.stream(str.split(" ")).filter(e->Collections.frequency(str, e)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		/*
		 * String[] str1 = str.split(" ");
		 * 
		 * Map<String, Integer> map = new HashMap<>();
		 * 
		 * for (String c : str1) {
		 * 
		 * if (map.containsKey(c)) {
		 * 
		 * map.put(c, map.get(c) + 1);
		 * 
		 * } else { map.put(c, 1); }
		 * 
		 * } int max = 0; String word=null;
		 * 
		 * for (Map.Entry<String, Integer> c1 : map.entrySet()) {
		 * 
		 * if (c1.getValue() > max) { max = c1.getValue(); word=c1.getKey(); }
		 * 
		 * 
		 * } System.out.println("Max word="+word+" - "+max);
		 */
	}

}
