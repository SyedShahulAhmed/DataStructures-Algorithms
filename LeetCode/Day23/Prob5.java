package LeetCode.Day23;

public class Prob5 {
    public static String maximumOddBinaryNumber(String s) {
        char c[]= s.toCharArray();
        for(int i =  0; i < (c.length)/2; i++){
            char temp = c[i];
            c[i] = c[i+1];
            c[i+1]= temp;
        } 
        return new  String(c);
    }
    public static void main(String[] args) {
        String s ="0101";
        System.out.println(maximumOddBinaryNumber(s));
    }
}