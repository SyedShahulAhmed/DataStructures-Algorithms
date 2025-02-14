package LinkedList;

import java.util.LinkedList;

public class ReverseLL {

    Node head;
   
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addf(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
      
    }
    public void print(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }
    public void reverse(){
        Node prev = head; 
        System.out.println("Previous Node : " + head.data);
        Node curr = head.next;
        System.err.println( "Current Node :" + curr.data);
        while(curr != null){
            Node nextNode = curr.next; 
            curr.next = prev; 
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;
    }
    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }
        
        Node newH = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newH;
    }
    public static void main(String[] args) {
        //Time Complexity :- O(n)
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> rev = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original LinkedList : " + list);
        for(int i = list.size()-1; i >=0; i--){
            rev.add(list.get(i));
        }
        System.out.println("Reversed LinkedList : " + rev );
        ReverseLL hc = new ReverseLL();
        hc.addf("One");
        hc.addf("Two");
        hc.addf("Three");
        hc.addf("Four");
        hc.print();
        hc.reverse();
        hc.print();
        hc.head = hc.reverseRecursive(hc.head);
        hc.print();
        
    }
        
}
