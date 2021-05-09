package com.red.plus.blue.design_patterns.template_method.concrete;

public class SortDescending extends SortAlgorithm {

	@Override
	public int compare(int left, int right) {
		return ((Integer)right).compareTo(left);
	}

}
