package Practise;

public class Ses1 {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        
    }
    public void add(int data){
        Node n = new Node(data);    
        if(head == null){
            head = n;
        }
        while(head.next != null){
            head = head.next;
        }
        head.next = n;
    }
    public void printLL(){
        Node cur = head;
        while(cur !=  null){
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Ses1 LL = new Ses1();
        LL.addFront(3);
        LL.addFront(2);
        LL.addFront(1);
        LL.add(4);
        LL.add(5);
        LL.printLL();
    }
}
