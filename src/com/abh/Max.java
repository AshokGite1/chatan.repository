package com.abh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,6);
		List<Integer> list2 = Arrays.asList(1,2,3,4,8);
		
		Stream.concat(list1.stream(), list2.stream()).toArray();
		
	
		

	
		
		
		
		
	}

}
