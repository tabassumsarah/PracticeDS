class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
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

    /** Get the nth element of the list.
    * Note: Here, the first node is 1. It’s not zero based like in an array */

    public Node getNode(int n){
        int counter = 1;
        Node current = head;
        while(current != null){
            if(counter == n){
                return current;
            }
            current = current.next;
            counter ++;
        }
       throw new IndexOutOfBoundsException("No node");
    }

}
