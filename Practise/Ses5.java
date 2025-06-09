package Practise;

public class Ses5 {
    public static class Node {
        int d;
        Node next;
        Node(int d){
            this.d = d;
            this.next = null;
        }
    }
    public static class Stack{
        public static Node head;
        public static  boolean isEmpty(){
            return head == null; 
        }
        public  void push(int d){
            Node temp = new Node(d);
            if(isEmpty()){
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
            return;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.d;
            head = head.next;
            return top;
        }
        public  int peek(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                
            }
            return head.d;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            int a = s.pop();
            System.out.println("Popped Element :- " + a);
        }
    }
}
