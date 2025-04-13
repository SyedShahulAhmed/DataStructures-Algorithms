package LeetCode.Day18;

import java.util.ArrayList;
import java.util.List;

public class Prob4 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(x) != -1){  //words[i].contains(String.valueOf(x))
                li.add(i);
            }
        }
        return li;
    }
    public static void main(String[] args) {
     String s[] = {"leet","code"};
     char x = 'e';
     System.out.println(findWordsContaining(s, x));   
    }
}
