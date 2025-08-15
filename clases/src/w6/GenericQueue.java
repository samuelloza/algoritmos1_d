package w6;

class GenericQueue<T> {
	private Node<T> first;
	private Node<T> last;
	private int size;

	private static class Node<E> {
		E data;
		Node<E> next;

		Node(E data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	public GenericQueue() {
		first = null;
		size = 0;
	}

	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if (first == null) {
			newNode.next = null;
			first = newNode;
		} else {
			newNode.next = last;
		}
		last = newNode;
		size++;
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		T data = first.data;
		first = first.next;
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
		return first.data;
	}

}
