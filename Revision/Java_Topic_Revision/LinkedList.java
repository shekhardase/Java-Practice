package Revision.Java_Topic_Revision;

/**
 * LinkedList
 */
public class LinkedList {

    private Node head;
    private int size;
    private Node tail;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        else if (index == size) {
            insertAtLast(val);
            return;
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2); // get function will return node that is present in that index
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        return value;
    }

    public Node find(int value) { // will return node (address) not in readable format
        Node temp = head;

        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        
        size++;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }
    }
}
