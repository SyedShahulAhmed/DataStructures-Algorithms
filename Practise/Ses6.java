package Practise;

import java.util.ArrayList;

public class Ses6 {
    public static class Stack {
        public static ArrayList<Integer> s = new ArrayList<>();
        public static boolean isEmpty(){
            return s.size() == 0;
        }
        public  void push(int d){
            s.add(d);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = s.get(s.size() - 1);
            s.remove(s.size()  - 1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return s.get(s.size() - 1);
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
            System.out.println("Popped Element :- " + s.peek());
            s.pop();
        }
    }
}
