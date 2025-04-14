package LeetCode.Day19;

public class Prob3 {
    Node head;
    class Node {
        int data ;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }
    public void print(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("Null");
    }
    public void reverse(){
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        Prob3 LL = new Prob3();
        LL.add(2);
        LL.add(4);
        LL.add(6);
        LL.add(8);
        LL.add(10);
        LL.print();
        LL.reverse();
        LL.print();
    }
}
