package w7;

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	public void showNode() {
		System.out.println("Node {" + this.data + "}");
	}
}

class LinkList {
	private Node first;

	public LinkList() {
		this.first = null;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			first = newNode;
		} else {
			newNode.next = first;
			first = newNode;
		}
	}

	public Node deleteFirst() {
		Node tmp = first;
		first = tmp.next;
		return tmp;
	}

	public void showList() {
		Node nodeTmp = first;
		while(nodeTmp != null) {
			nodeTmp.showNode();
			nodeTmp = nodeTmp.next;
		}
	}
	
	public Node find(int key) {
		Node current = first;
		while(current != null) {
			if (current.data == key) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	
	public Node delete(int key) {
		Node current = first;
		Node previus = first;
		
		while (current.data != key) {
			if (current.next == null) {
				return null;
			} else {
				previus = current;
				current = current.next;
			}
		}
		
		if (current == first) {
			first = first.next;
		} else {
			previus.next = current.next;			
		}
		return current;
	}
	
	public void insertSort(int key) {
		Node newNode = new Node(key);
		Node current = first;
		Node previus = null;
		
		while (current != null && key > current.data) {
			previus = current;
			current = current.next;
		}
		
		if (previus == null) {
			first = newNode;
		} else {
			previus.next = newNode;
		}
		newNode.next = current;
	}
}

public class Listas {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		/*list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);

		System.out.println("------------");
		list.showList();
		System.out.println("++++++++++");
		
		//System.out.println("Buscando nodo con el valor de 20");
		//System.out.println("Nodo encontrado " + list.find(50).next.next.data );
		//System.out.println("++++++++++");
		
		System.out.println("Borrando ");
		
		Node tmpDelete = list.delete(10); 
		System.out.println("Se elimino el " + tmpDelete.data);
		
		//list.delete(30); 
		System.out.println("Mostrando la lista");
		list.showList();
		
		tmpDelete = list.delete(20); 
		System.out.println("Se elimino el " + tmpDelete.data);
		list.showList();

		System.out.println("Fin");
		
		
		while (!list.isEmpty()) {
			Node tmp = list.deleteFirst();
			tmp.showNode();
			System.out.println("-----");
		}

		System.out.println(list.isEmpty());*/
		
list.insertSort(10);
list.insertSort(100);
list.insertSort(50);
list.insertSort(2);
list.insertSort(0);

list.showList();


	}

}
