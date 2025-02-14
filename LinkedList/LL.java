package LinkedList;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Adding ELements :");
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("Adding at Front :");
        list.addFirst(0);
        list.addFirst(-1);
        System.out.println(list);
        System.out.println("Adding at End :");
        list.addLast(4);
        list.addLast(5);
        System.out.println(list);
        System.out.println("Removing 0 and -1 :");
        list.removeFirst();
        list.removeFirst();
        System.out.println(list);
        System.out.println("Removing 4 and 5 :");
        list.removeLast();
        list.removeLast();
        System.out.println(list);

        System.out.println("Size of list :" + " "+ list.size());

        System.out.println("Traversing list :");
        for(int i = 0; i < list.size(); i++ ){
            System.out.print(list.get(i) + " -> ");
            
        }
        System.out.println("Null");
    }
}
