package w6;

import java.util.ArrayList;

public class CustomStack {
	private ArrayList<String> array;

	public CustomStack() {
		this.array = new ArrayList<String>();
	}

	public void push(String value) {
		array.add(value);
	}

	public String pop() {
		String value = array.get(array.size() - 1);
		array.remove(array.size() - 1);
		return value;
	}

	public String peek() { // peek
		return array.get(array.size() - 1);
	}

	public boolean isEmpty() {
		return array.isEmpty();
	}
}
