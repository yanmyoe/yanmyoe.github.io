// Binary Tree in Java

// Node creation
class Node {
    int key;
    Node left, right;
  
    public Node(int item) {
    key = item;
    left = right = null;
    }
  }
  
  class BinaryTree {
    Node root;
  
    BinaryTree(int key) {
    root = new Node(key);
    }
  
    BinaryTree() {
    root = null;
    }
  
    // Traverse Inorder  => left child => root => right child
    public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.key);  // 4 2 1 3
      traverseInOrder(node.right);
    }
    }
  
    // Traverse Postorder  : left => right => root
    public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.key);
    }
    }
  
    // Traverse Preorder  root => leftchild => right child
    public void traversePreOrder(Node node) {   // recursive
    if (node != null) {
      System.out.print(" " + node.key);   // 1 2 4 3
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
    }
  
    public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.root = new Node(1);  //                                    1
    tree.root.left = new Node(2);                        //       /  \
    tree.root.right = new Node(3);                  //          2      3
    tree.root.left.left = new Node(4);     //                  /
                                                        //         4
    System.out.print("Pre order Traversal: ");
    tree.traversePreOrder(tree.root);
    System.out.print("\nIn order Traversal: ");
    tree.traverseInOrder(tree.root);
    System.out.print("\nPost order Traversal: ");
    tree.traversePostOrder(tree.root);
    }
  }
