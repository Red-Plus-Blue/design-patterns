package com.red.plus.blue.design_patterns.template_method.concrete;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		var input = Arrays.asList(3, 5, 1, 4, 2);
		sort(input, new SortAscending());
		sort(input, new SortDescending());
	}
	
	protected static void sort(List<Integer> input,  SortAlgorithm algorithm) {
		var output = algorithm.sort(input).stream().map(Object::toString).collect(Collectors.joining(","));
		System.out.println(String.format("%s: %s", algorithm.getClass().getSimpleName(), output));
	}

}
