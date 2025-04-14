package LeetCode.Day19;

public class Prob2 {
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
    public void remove(int val){
        if(head.data == val && head != null){
            head = head.next;
        }
        Node cur = head;
        while(cur != null && cur.next != null){
            if(cur.next.data == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
    }
    public static void main(String[] args) {
        Prob2 LL = new Prob2();
        LL.add(5);
        LL.add(6);
        LL.add(7);
        LL.add(8);
        LL.add(9);
        LL.add(8);
        LL.print();
        LL.remove(8);
        System.out.print("Removing Element 8 := ");
        LL.print();
    }
}
