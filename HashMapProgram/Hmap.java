package HashMapProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hmap {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c',3);
        map.put('d', 4);
        System.out.println("Original Map :-" + map);
        map.put('d', 10);
        System.out.println("Updating Key d Value");
        System.out.println("Updated Map :-" + map);

        System.out.println("Key a is Present :-" + map.containsKey('a'));
        System.out.println("Key z is Present :-" + map.containsKey('z'));

        System.out.println(map.get('d'));
        System.out.println(map.get('z'));

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println("The value of " + e.getKey() + " is " + e.getValue());
        }
        System.out.println("Using Set");
        Set<Character> keys = map.keySet();
        for(Character c : keys){
            System.out.println("The value of " + c + " is " + map.get(c));
        }
        map.remove('c');
        System.out.print("Removing c :- ");
        System.out.println(map);

        int arr[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6};

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int c : arr){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        System.out.println(freq);
        for(int num : arr){
            if(freq.get(num) == 1){
                System.out.println(num);
            }
        }
    }
}
