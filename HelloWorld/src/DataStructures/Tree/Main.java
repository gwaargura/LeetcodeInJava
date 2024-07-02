package DataStructures.Tree;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(6);
        Tree newTree = new Tree(root);
        newTree.insert(1);
        newTree.insert(7);
        newTree.insert(3);
        newTree.insert(8);
        newTree.insert(5);
        newTree.insert(10);
        newTree.insert(-1);
//        root.left.left.left = new Node(-5);
//        root.left.left.left.left = new Node(-6);
//        root.left.left.left.right = new Node(-4);
//        root.left.right.left = new Node(2);
/*
*               6
*              / \
*             1   7
*           /  \   \
*         -1    3   8
*              / \   \
*                 5   10
* */
        System.out.println("Pre Order: ");
        newTree.preOrder(root);
        System.out.println("\nIn Order: ");
        newTree.inOrder(root);
        System.out.println("\nPost Order: ");
        newTree.postOrder(root);
        System.out.println("\nIs Heap: " + newTree.isHeap(root));
        try{
            System.out.println("Search: " + newTree.search(9).value);
        }catch(Exception e){
            System.out.println("Search: Value does not exist");
        }
        System.out.println("Height: " + newTree.getHeight(root));

        System.out.println("Breadth First Search: ");
        newTree.breadthFirstSearch(root);

        System.out.println("\nCount Node: " + newTree.countNode(root));
        System.out.println("Min: " + newTree.getMin(root));
        System.out.println("Is AVL: " + newTree.isAVL(root));
        System.out.println("Cost: " + newTree.cost(root));
        System.out.println("Sum: " + newTree.getSum());
    }

}
