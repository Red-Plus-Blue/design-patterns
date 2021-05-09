package com.red.plus.blue.design_patterns.template_method.concrete;

public class SortAscending extends SortAlgorithm {

	@Override
	public int compare(int left, int right) {
		return ((Integer)left).compareTo(right);
	}

}
