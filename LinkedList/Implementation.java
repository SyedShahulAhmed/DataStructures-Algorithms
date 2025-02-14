package LinkedList;

public class Implementation {

    private int size;

    Implementation(){
        this.size = 0;
    }

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add at the front
    public void addFront(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;  // ✅ Increment size correctly
    }

    // Remove front node
    public void removefront(){
        if(head == null){
            System.out.println("List Empty");
            return; // ✅ Return here to avoid incorrect size decrement
        }
        head = head.next;
        size--;  // ✅ Decrement only if node was removed
    }

    // Remove last node
    public void removelast(){
        if(head == null){
            System.out.println("List Empty");
            return;
        }
        if(head.next == null){
            head = null;
            size--;  // ✅ Decrement for single-node list
            return;
        }

        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        size--;  // ✅ Decrement for general case
    }

    // Add at the back
    public void addBack(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {  // Traverse until the last node
                currNode = currNode.next;
            }
            currNode.next = newNode; // Append new node at the end
        }
        size++;  // ✅ Increment size correctly
    }

    // Print linked list
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Implementation list = new Implementation();
        list.addFront("One");
        list.addBack("Two");
        list.addBack("Three");
        list.addBack("Remove");
        list.removefront();
        list.removelast();
        list.print();  
        System.out.println("Size: " + list.getSize());  // ✅ Correct size output
    }
}
