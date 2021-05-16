class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    private int getData() {
        return this.data;
    }

    private void setData(int data) {
        this.data = data;
    }

    private Node getNext() {
        return this.next;
    }

    private void setNext(Node next) {
        this.next = next;
    }

}

public class LinkedListBase {
    Node head;
    Node tail;

    LinkedListBase() {
        this.head = null;
        this.tail = null;
    }

    private void setHead(Node head) {
        this.head = head;
    }

    private Node getHead() {
        return this.head;
    }

    private void setTail(Node tail) {
        this.tail = head;
    }

    private Node getTail() {
        return this.tail;
    }
}
