// Linked list implementation in Java

class LinkedList {
    // Creating a node
    Node head;
  
    static class Node {
      int value;
      Node next;
  
      Node(int d) {
        value = d;
        next = null;
      }
    }
  
    public static void main(String[] args) {
      LinkedList linkedList = new LinkedList();
  
      // Assign value values
      linkedList.head = new Node(1);  // head => value=1|next=null
      Node second = new Node(2);
      Node third = new Node(3);
  
      // Connect nodess
      linkedList.head.next = second; // head => value=1|next=second  value=2|next=third value=3|next=null
      second.next = third;
  
      // printing node-value
      while (linkedList.head != null) {
        System.out.print(linkedList.head.value + " ");
        linkedList.head = linkedList.head.next;
        System.out.println("Next value of Current Head" + linkedList.head);
      }
    }
  }