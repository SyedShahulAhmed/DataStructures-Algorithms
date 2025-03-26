package LeetCode.Day9;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqOccur {
    public static boolean Uniq(int arr[]){
        // HashMap<Integer,Integer> freq = new HashMap<>();
        // for(int n : arr){
        //     freq.put(n, freq.getOrDefault(n, 0)+1);
        // }
        // // System.out.println(freq);
        // // int tar = freq.get(arr[2]);
        // // System.out.println(tar);
        // // for(int m : freq.values()){
        // //     if(m == tar){
        // //         return false;
        // //     }else{
        // //         return true;
        // //     }
        // // }
        // // return true; 
        // int firstValue = -1;
        // for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        //     if (firstValue == -1) {
        //         firstValue = entry.getValue();
        //     } else if (entry.getValue() != firstValue) {
        //         return true;
        //     }
        // }
        // return false;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        HashSet<Integer> seenFrequencies = new HashSet<>();
        
        for (int count : freq.values()) {
            if (!seenFrequencies.add(count)) {
                return false;
            }
        }

        return true; 
    }
    public static void main(String[] args) {
        int arr[] = {3,5,-2,-3,-6,-6};
        System.out.println(Uniq(arr));
    }
}
