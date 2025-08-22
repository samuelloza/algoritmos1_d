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
        Node2 tail = null;

        while (current != null) {
            current.showNode2("->");
            tail = current;
            current = current.next;
        }
        System.out.println();

        current = tail;
        while (current != null) {
            current.showNode2("<-");
            current = current.prev;
        }
        System.out.println();
    }

    public Node2 deleteLast() {
        if (isEmpty()) return null;

        Node2 current = last;
        last = current.next;

        if (last != null) {
            last.prev = null;
        } else {
            first = null;
        }

        size--;
        return current;
    }

    public Node2 deleteFirst() {
        if (isEmpty()) return null;

        Node2 current = first;
        first = current.prev;

        if (first != null) {
            first.next = null;
        } else {
            last = null;
        }

        size--;
        return current;
    }

    public Node2 getFirstElement() {
        return first;
    }

    public Node2 getLastElement() {
        return last;
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
        if (element == null) return null;

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

        size--;
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
        System.out.println("First (cola): " + list.getFirstElement().data);
        System.out.println("Last (cabeza): " + list.getLastElement().data);
        System.out.println("----");

        list.deleteLast();
        list.showList();
        System.out.println("----");

        list.deleteFirst();
        list.showList();

        System.out.println("Buscar y eliminar");
        list.delete(2);
        list.showList();

        if (!list.isEmpty()) {
            System.out.println("First: " + list.getFirstElement().data);
        } else {
            System.out.println("Lista vacía");
        }
    }
}
