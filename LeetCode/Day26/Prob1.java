package LeetCode.Day26;

import java.util.HashSet;
import java.util.Set;

public class Prob1 {
    public static boolean checkIfPangram(String sentence) {
      Set<Character> alp = new HashSet<>();
      Set<Character> ch = new HashSet<>();
      for(char i = 'a'; i<= 'z'; i++){
        alp.add(i);
      }
      for(char c : sentence.toCharArray()){
        ch.add(c);
      }
      return alp.equals(ch);
    }
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

}