package LeetCode.Day19;


public class Prob1 {
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
    public void middleNode(){
        Node f = head,s = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        System.out.println(s.data);
    }
    public static void main(String[] args) {
        Prob1 LL = new Prob1();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        LL.print();
        LL.middleNode();
    }
}
