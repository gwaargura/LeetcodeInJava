package DataStructures.LinkedList;

public class Node {

    //EACH NODE HAS 2 VALUES:
    //THE NODE'S DATA - (VALUE)
    //THE KEY TO THE NEXT NODE - (NEXT)
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
