package com.red.plus.blue.design_patterns.iterator.concept;

import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		var list1 = new ListCollection<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		var list2 = new LinkedListCollection<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		
		Stream.of(list1, list2).forEach((list) -> {
			list.getIterator().forEach(System.out::println);
		});
	
	}
	
}
