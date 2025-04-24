package LeetCode.Day22;

public class Prob1 {
    public static void print(char c[]){
        for(char i : c){
            System.out.println(i);
        }
    }

    public static String reversePrefix(String word, char ch) {
        // char rev[] = new char[word.length()];
        // int idx = 0;
        // for(char c : word.toCharArray()){
        //     if(c == ch){
        //         rev[idx] = c;
        //         idx++;
        //     }
        // }
        // return rev;
        int first = word.indexOf(ch);
        if(first == -1){
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0,first+1)).reverse();
        if(first < word.length()){
            sb.append(word.substring(first+1));
        }
        return sb.toString();


        
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reversePrefix(s,'d'));
    }
}