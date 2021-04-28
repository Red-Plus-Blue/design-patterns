package com.red.plus.blue.design_patterns.iterator.concept;

public class ListCollection<T> extends Collection<T> {

	protected static class ListIterator<T> extends Iterator<T> {
		
		protected int currentIndex;
		
		public ListIterator(ListCollection<T> target) {
			super(target);
		}

		@Override
		public T next() {
			var element = (T)((ListCollection<T>)target).elements[currentIndex];
			currentIndex++;
			return element;
		}

		@Override
		public boolean hasNext() {
			var target = (ListCollection<T>)this.target;
			return (currentIndex < target.elements.length) && target.elements[currentIndex] != null;
		}
		
	}
	
	protected Object[] elements = new Object[100];
	protected int lastIndex;

	
	@Override
	public Iterator<T> getIterator() {
		return new ListIterator<T>(this);
	}
	
	public void add(T element) {
		elements[lastIndex] = element;
		lastIndex++;
	}
}
