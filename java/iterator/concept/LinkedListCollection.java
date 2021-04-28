package com.red.plus.blue.design_patterns.iterator.concept;

public class LinkedListCollection<T> extends Collection<T> {
	
	protected static class Node<T> {
		
		protected T value;
		protected Node<T> next;
		
		public Node(T value) {
			this.value = value;
		}
		
		public T value() {
			return value;
		}
		
		public Node<T> next() {
			return next;
		}
		
		public void setNext(Node<T> next) {
			this.next = next;
		}
		
	}

	protected static class LinkedListIterator<T> extends Iterator<T> {
		
		protected Node<T> current;
		
		public LinkedListIterator(LinkedListCollection<T> target) {
			super(target);
			current = target.head;
		}

		@Override
		public T next() {
			var value =  current.value();
			current = current.next();
			return value;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}
		
	}

	protected Node<T> head;
	
	
	@Override
	public Iterator<T> getIterator() {
		return new LinkedListIterator<T>(this);
	}
	
	public void add(T value) {
		if(head == null) {
			head = new Node<T>(value);
			return;
		}
		var node = new Node<T>(value);
		node.setNext(head);
		head = node;
	}
		

}
