package w6;

public class CustomQueue {
	private int maxSize = 0;
	private int array[];
	private int front;
	private int size;

	public CustomQueue(int maxSize) {
		this.maxSize = maxSize;
		this.array = new int[maxSize];
		front = 0;
		size = -1;
	}

	public void add(int value) {
		size++;
		array[size] = value;
	}

	public int remove() {
		int tmp = array[front];
		front++;
		return tmp;
	}

	public int peek() { // top
		return array[front];
	}

	public int first() {
		return array[0];
	}
}
