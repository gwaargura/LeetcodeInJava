package DataStructures.Tree;

public class Tree {
    public Node root;

    public Tree() {
        root = null;
    }
    public Tree(Node root) {
        this.root = root;
    }

    // GET TREE
    public void inOrder(Node current){
        if(current != null){
            inOrder(current.left);
            System.out.print(current.value + " -> ");
            inOrder(current.right);
        }
    }
    public void preOrder(Node current){
        if(current != null){
            System.out.print(current.value + " -> ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }
    public void postOrder(Node current){
        if(current != null){
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.value + " -> ");
        }
    }
    // --> OK

    // CHECK IF TREE IS HEAP
    public boolean isHeap(Node current){
        if(current == null){
            return true;
        }
        if(current.left != null && current.value < current.left.value){
            return false;
        }
        if(current.right != null && current.value > current.right.value){
            return false;
        }
        return isHeap(current.left) && isHeap(current.right);
    }
    // --> OK

    // SEARCH FOR A VALUE
    private Node search_private(Node current, int value){
        if(current == null){
            return null;
        }
        if(current.value == value){
            return current;
        }
        if(current.value > value){
            return search_private(current.left, value);
        }
        return search_private(current.right, value);
    }
    public Node search(int value){
        return search_private(root, value);
    }
    // --> OK

    // GET HEIGHT OF TREE
    private int getHeight_private(Node current, int value){
        if(current == null){
            return value;
        }
        int left = getHeight_private(current.left, value + 1);
        int right = getHeight_private(current.right, value + 1);
        return Math.max(left, right);
    }
    public int getHeight(Node current){
        return getHeight_private(current, 0);
    }
    // --> OK

    // GET LEVEL -----------> NEED MORE RESEARCH
    public void getLevel(Node current, int level){
        // LAST NODE
        if(current == null){
            return;
        }
        //
        if(level == 1){
            System.out.print(current.value + " -> ");
        }

        //
        getLevel(current.left, level - 1);
        getLevel(current.right, level - 1);
    }

    // BFS -----------> NEED MORE RESEARCH
    public void breadthFirstSearch(Node current){
        int height = getHeight(current);
        for(int i = 0; i < height; i++){
            getLevel(current, i);
        }
    }
    // --> OK



    // INSERT INTO TREE
    // --> INSERT STRAIGHT BY VALUE, NO ROTATION TO KEEP THE TREE BEAUTIFUL
    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }
        else{
            // LEFT
            if(value < root.value) {
                // CHECK IF LEFT NODE IS EMPTY -- > INSERT
                if (root.left == null) {
                    root.left = new Node(value);
                    return;
                }
                // CREATE A NEW TREE WITH ROOT = LEFT NODE IF LEFT NODE IS NOT EMPTY
                Tree newTree = new Tree(root.left);
                // RECURSION UNTIL ROOT == NULL
                newTree.insert(value);
            }
            // THE SAME WITH THE LEFT
            else{
                    if(root.right == null) {
                        root.right = new Node(value);
                        return;
                    }
                    Tree newTree = new Tree(root.right);
                    newTree.insert(value);
            }
        }
    }
        // --> OK

    // COUNT NODE
    public int countNode(Node current){
        if(current == null){
            return 0;
        }
        return countNode(current.left) + countNode(current.right) + 1;
    }
    // --> OK

    // GET MIN VALUE OF THE TREE
    public int getMin(Node current){
        if(current.left == null){
            return current.value;
        }
        return getMin(current.left);
    }
    // --> OK

    // AVL: Height of left, right side is at most differ by 1
    boolean isAVL(Node current){
        if(current == null){
            return true;
        }
        if(Math.abs(getHeight(current.left)  - getHeight(current.right)) > 1){
            return false;
        }
        return isAVL(current.left) && isAVL(current.right);
    }
    // --> OK

    //THIS FUNCTION CALCULATE THE MAXIMUM PATH VALUE IN THE TREE
    public int cost(Node current){
        if(current == null){
            return 0;
        }
        int currentCost = Math.max(cost(current.left), cost(current.right))+ current.value;
        return Math.max(currentCost, Math.max(cost(current.left), cost(current.right)));
    }
    // --> OK

    public int getSum(){
        return getSum_private(root);
    }
    private int getSum_private(Node current){
        if(current == null){
            return 0;
        }
        int currentSum = getSum_private(current.left) + getSum_private(current.right) + current.value;
        return currentSum;
    }

    public void deleteByMerge(){
        
    }

    public void deleteByCopying(){

    }


}

