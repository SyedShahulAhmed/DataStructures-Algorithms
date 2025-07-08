package Queue;

import java.util.*;

public class CFImplement {
    public static void main(String[] args) {
        System.out.println("Using Linked List :-");
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        System.out.println(q1.element()); //head
        System.out.println(q1.size());
        while(!q1.isEmpty()){
            System.out.println( q1.peek());
            q1.remove();
        }
        System.out.println("Using Array Deque :- ");
        Queue<Character> q2 = new ArrayDeque<>();
        q2.add('a');
        q2.add('b');
        q2.add('c');
        while(!q2.isEmpty()){
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}
