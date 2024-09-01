package Revision.Java_Topic_Revision;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(0);
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertAtLast(11000);
        ll.insert(99, 2);
        ll.deleteFirst();
        ll.display();
    }
}
