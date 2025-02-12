package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Adding Elements :");
        arr.add(0);
        arr.add(1);
        arr.add(3);
        System.out.println(arr);
        System.out.println("Getting Element at Index 2 :");
        System.out.println(arr.get(2));
        System.out.println("Adding Element 2 at Index 2 :");
        arr.add(2, 2);
        System.out.println(arr);
        System.out.println("Setting Element 5 at Index 0");
        arr.set(0, 5);
        System.out.println(arr);
        System.out.println("Deleting 0 Index Element");
        arr.remove(0);
        System.out.println(arr);
        System.out.println("Size of the Array");
        System.out.println(arr.size());
        System.out.println("Iterating Using the Loops :");
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        arr.add(0, 4);
        System.out.println("Before Sorting :");
        System.out.println(arr);
        System.out.println("After Sorting :");
        Collections.sort(arr);
        System.out.println(arr);
    }
}
