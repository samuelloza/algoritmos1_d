package w6;

class MyStackGeneric<T> {
	private Node<T> top;
	private int size;

	private static class Node<E> {
		E data;
		Node<E> next;

		Node(E data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

	public MyStackGeneric() {
		top = null;
		size = 0;
	}

	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		T data = top.data;
		top = top.next;
		size--;
		return data;
	}

	public int size() {
		return size;
	}
	
	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.data;
	}
	
}
