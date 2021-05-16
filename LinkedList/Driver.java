public class Driver {
    public  static void main(String args[]){
        Node head = new Node(1, null);
        Node n1 = new Node(2, null);
        Node  n2 = new Node(3, null);
        Node  n3 = new Node(4, null);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        LinkedListBase linkedListBase = new LinkedListBase();
        linkedListBase.head = head;
        linkedListBase.tail = n3;

        Node node = linkedListBase.getNode(0);
        System.out.println(node.getData());
    }
}
