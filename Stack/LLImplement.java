package Stack;

public class LLImplement {
    private static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static class Stack{
        public static Node head;
        public static boolean isEmpty(){
         return head==null;
        }
        public  void push(int data){
            Node newN = new Node(data);

            if(head == null){
                head = newN;
                return;
            }
            newN.next = head;
            head = newN;
        }
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(6);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
