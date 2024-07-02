package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // --> ADD TO HEAD
        list.insertAtHead(1);
        list.insertAtHead(2);
        // --> OK

        // --> ADD TO TAIL
        list.insertAtTail(11);
        list.insertAtTail(12);
        // --> OK

        // --> ADD AT INDEX
        list.insertAtIndex(4, 4);
        list.insertAtIndex(0, 0);
        list.insertAtIndex(4, 5);
        // --> OK

        // --> GET NODE AT INDEX
        list.getIndex(3);
        // --> OK

        // --> DELETE AT HEAD
        list.deleteAtHead();
        // --> OK

        // --> DELETE AT TAIL
        list.deleteAtTail();
        // --> OK

        // --> DELETE AT INDEX
        list.deleteAtIndex(2);
        // --> OK

        // --> REVERSE THE LIST
        list.traverse();
        // --> OK

        // --> GET THE FIRST NODE WITH MAX VALUE
        list.getMax();
        // --> OK

        // --> SORT LIST BY INSERTION SORT
        list.insertionSort();
        // --> NOT OK

        list.printList();
    }
}
