package w7;

class Node2 {
	public int data;
	public Node2 next;
	public Node2 prev;

	public Node2(final int data) {
		this.data = data;
	}

	public void showNode2(String simbol) {
		System.out.print("{" + this.data + "} " + simbol);
	}
}

class LinkList2 {
	private Node2 last;
	private Node2 first;

	private int size;

	public LinkList2() {
		this.last = null;
		this.first = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void insert(int data) {
		Node2 newNode2 = new Node2(data);
		if (isEmpty()) {
			last = newNode2;
			first = newNode2;
		} else {
			newNode2.next = last;
			last.prev = newNode2;
			last = newNode2;
		}
		this.size++;
	}

	public void showList() {
		Node2 current = last;
		Node2 oldCurrent = last;

		while (current != null) {
			current.showNode2("->");
			oldCurrent = current;
			current = current.next;
		}
		System.out.println();
		current = oldCurrent;
		while (current != null) {
			current.showNode2("<-");
			current = current.prev;
		}
		System.out.println();
	}

	public Node2 deleteLast() {
		Node2 current = last;
		last = current.next;
		last.prev = null;
		return current;
	}

	public Node2 getFirstElement() {
		return first;
	}

	public Node2 getLastElement() {
		return last;
	}

	public Node2 deleteFist() {
		Node2 current = first;
		first = current.prev;
		first.next = null;
		return current;
	}

	public Node2 findElement(int data) {
		Node2 current = last;
		while (current != null && current.data != data) {
			current = current.next;
		}
		return current;
	}

	public Node2 delete(int data) {
		Node2 element = findElement(data);
		
		if (element.prev != null) {			
			element.prev.next = element.next;
		} else {
			last = element.next;			
		}
		
		if (element.next != null) {
			element.next.prev = element.prev;
		} else {			
			first = element.prev;
		}	
		
		this.size--;
		return element;
	}

}

public class LinkListDouble {

	public static void main(String[] args) {
		LinkList2 list = new LinkList2();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		list.showList();
		System.out.println(list.getFirstElement().data);
		System.out.println(list.getLastElement().data);
		System.out.println("----");

		// list.deleteLast();

		list.showList();
		System.out.println("----");

		System.out.println(list.getFirstElement().data);
		System.out.println(list.getLastElement().data);

		// list.deleteFist();
		list.showList();

		System.out.println("Buscar y eliminar");
		list.delete(2);
		list.delete(3);
		list.delete(1);
		//list.delete(4);

		list.showList();
		
		if (!list.isEmpty()) {
			System.out.println(list.getFirstElement().data);			
		} else {
			list.showList();
		}

		// System.out.println();

	}

}
