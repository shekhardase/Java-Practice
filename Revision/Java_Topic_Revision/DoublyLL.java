package Revision.Java_Topic_Revision;

public class DoublyLL {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val, null, null);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;

    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
