package com.red.plus.blue.design_patterns.template_method.concrete;

import java.util.ArrayList;
import java.util.List;

public abstract class SortAlgorithm {

	public List<Integer> sort(List<Integer> input) {
		var sorted = new ArrayList<Integer>();
		
		input.forEach(left -> {
			var index = 0;
			for(var right : sorted) {
				if(compare(left, right) <= 0) {
					break;
				}
				index++;
			}
			sorted.add(index, left);
		});
		
		return sorted;
	}
	
	public abstract int compare(int left, int right);
	
}
