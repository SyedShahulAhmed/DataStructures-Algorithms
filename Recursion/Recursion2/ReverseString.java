package Recursion.Recursion2;

public class ReverseString {
    public static void Reverse(String s, int index){
        // Time Complexity = O(n) //n = String length
        if(index == -1 ){
            return;
        }
        System.out.print(s.charAt(index));
        Reverse(s,index-1);
    }
    public static void main(String[] args) {
        // String s = "abcd";
        // String rev = "";
        // for(int i = s.length() -1 ; i >= 0; i--){
        //     rev += s.charAt(i);
        // }
        // System.out.println(rev);
        String s1 ="Madam";
        Reverse(s1,s1.length()-1);
    }
}
