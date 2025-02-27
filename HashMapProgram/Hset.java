package HashMapProgram;
import java.util.*;
import java.util.Iterator;
public class Hset {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> a = new HashSet<>();
        for(int i = 0; i <= 10; i++){
            s.add(i);
        }
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1);
        a.add(5);
        a.add(6);
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
        s.addAll(a);
        System.out.println(s);
        System.out.println(s.equals(a));
        s.forEach(n -> System.out.print(n));
        System.out.println("");
        System.out.println(s.isEmpty());
        System.out.println(s.getClass());
        System.out.println(s.hashCode());
        System.out.println(s.contains(2));
        System.out.println(s.contains(8));
        System.out.println(s.size());
        s.clear();
        System.out.println(s);
        System.out.println(s.isEmpty());
        Iterator it = a.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}