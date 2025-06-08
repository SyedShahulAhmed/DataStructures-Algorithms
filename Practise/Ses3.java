package Practise;

import java.util.Iterator;
import java.util.LinkedList;

public class Ses3 {
    public static void printArr(int nums[]){
        for(int n : nums){
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        LinkedList<Integer> li =new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println(li);
        li.addFirst(-1);
        li.addFirst(-2);
        System.out.println(li);
        li.addLast(-3);
        li.addLast(-4);
        li.addLast(1);
        System.out.println(li);
        // li.clear();
        // System.out.println(li);
        System.out.println(li.contains(1));
        System.out.println(li.contains(7));
        System.out.println(li.element()); //head
        System.out.println(li.indexOf(4));
        System.out.println(li.lastIndexOf(1));
        System.out.println(li.get(5));
        System.out.println(li.get(1));
        for(int n : li){
            System.out.print(li.indexOf(n) + " ");
        }
        System.out.println(" ");
        System.out.println(li);
        System.out.println(li.isEmpty());
        // li.clear();
        // System.out.println(li.isEmpty());
        System.out.println(li.hashCode());
        li.removeIf(e -> e < 0);
        System.out.println(li);
        li.removeLast();
        System.out.println(li);
        // li.replaceAll(e -> 3);
        // System.out.println(li);
        li.forEach(e -> {
            System.out.print(e + "-> ");
        });
        System.out.println("Null");
        li.pop();
        System.out.println(li);
        System.out.println(li.size());
        Iterator<Integer> it = li.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "-");
        }
    }
}