package LeetCode.Day19;

public class Prob4 {
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
    public Node reverse(Node head){
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public boolean isPalindrome(){
        Node f = head,s = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        s = reverse(s);
        f = head;
        while(s != null){
            if(s.data != f.data){
                return false;
            }else{
                s = s.next;
                f = f.next;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Prob4 LL = new Prob4();
        LL.add(1);
        LL.add(2);
        LL.add(2);
        LL.add(2);
        LL.add(1);
        LL.print();
        System.out.println(LL.isPalindrome());
        
    }
}
