package DataStructures.LinkedList;

/*
*
* UNDERSTANDING:
* THEORY: 100%
* CODE: 80%
*
* */
public class LinkedList {
    private Node head;
    private Node tail;

    //CREATE A NEW LINKED LIST
    public LinkedList() {
        head = null;
        tail = null;
    }
    // --> OK

    //CHECK IF LIST IS EMPTY
    boolean emptyList(){
        return head == null;
    }
    // --> OK

    //CLEAR LIST
    void clear()
    {
        head=tail=null;
    }
    // --> OK

// <-------------------------------------------------------------------------------------------------->
    // ADD NODE

    //THIS FUNCTION ADD A NODE TO THE HEAD OF LIST
    public void insertAtHead(int data) {
        Node newNode = new Node(data, null);
        if(emptyList()){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    // --> OK

    //THIS FUNCTION ADD A NODE TO THE TAIL OF THE LIST
    public void insertAtTail(int data) {
        Node newNode = new Node(data, null);
        if(emptyList()){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    // --> OK

    //THIS FUNCTION COUNTS THE NUMBER OF NODES IN THE LIST
    public int countNode() {
        if (emptyList()) {
            return 0;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    // --> OK


    //THIS FUNCTION GETS THE INFORMATION OF A NODE GIVEN ITS INDEX
    public Node getIndex(int index){
        if(emptyList() || index > countNode()){
            return null;
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            if(current != null){
                current = current.next;
            }
        }
        return current;
    }
    // --> OK


    //THIS FUNCTION INSERT A NODE TO A DESIRED INDEX
    public void insertAtIndex(int index, int data) {
        Node newNode = new Node(data, null);

        //EMPTY LIST OR INDEX IS LARGER THAN TOTAL OF NODES
        if(emptyList() || index > countNode()){
            System.out.println("Index " + index + " out of bounds");
            return;
        }

        //INDEX = 0
        if(index == 0){
            insertAtHead(data);
            return;
        }

        //ELSE

        //GETTING THE CURRENT NODE AT THE INDEX
        Node replacing = getIndex(index);

        //GETTING THE NODE BEFORE THAT
        Node beforeReplacing = getIndex(index - 1);

        //INSERT
        newNode.next = replacing;
        beforeReplacing.next = newNode;
    }
    // --> OK


    //THIS FUNCTION DELETES THE HEAD
    public void deleteAtHead(){
        if(emptyList()){
            System.out.println("Empty list");
            return;
        }
        if(countNode() == 1){
            clear();
            return;
        }
        head = head.next;
    }

    //THIS FUNCTION DELETES AT TAIL
    public void deleteAtTail(){
        if(emptyList()){
            System.out.println("Empty list");
            return;
        }
        if(countNode() == 1){
            clear();
            return;
        }
        Node newNode = getIndex(countNode() - 2);
        newNode.next = null;
        tail = newNode;
    }
    // --> OK

    public void deleteAtIndex(int index) {
        if(emptyList() || index > countNode()){
            System.out.println("Index out of bounds");
            return;
        }
        if(index == 0){
            deleteAtHead();
            return;
        }
        if(index == countNode()){
            deleteAtTail();
            return;
        }
        Node beforeReplacing = getIndex(index - 1);
        Node replacing = beforeReplacing.next;
        beforeReplacing.next = replacing.next;
    }
    // --> OK

    // REVERSE THE LIST
    public void traverse(){

        Node prev = null;

        //CURRENT NODE = HEAD (ASSIGN TO HEAD)
        Node current = head;

        Node after;

        while(current != null){
            //NEXT NODE OF CURRENT (USE TO MOVE CURRENT THROUGH THE LIST)
            after = current.next;

            //BECAUSE THE LIST IS GOING TO BE REVERSED, THE KEY TO NEXT NODE IS
            //TRANSFERRED FROM BEFORE TO AFTER CURRENT NODE
            current.next = prev;
            prev = current;

            //MOVE THE CURRENT NODE TO THE NEXT NODE
            current = after;
        }
        //AT THE END OF THE FUNCTION, PREV WILL BE THE TAIL --> THE NEW HEAD
        tail = head;
        head = prev;
    }
    // --> OK

    //PRINT THE LIST
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // --> OK

    //GET MAX VALUE
    public Node getMax(){
        Node max = head;
        Node current = head.next;
        while(current != null){
            if(current.value > max.value){
                max = current;
            }
            current = current.next;
        }
        return max;
    }

    public void insertionSort(){
        Node key = head.next;


    }

}
