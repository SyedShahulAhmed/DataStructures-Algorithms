package LeetCode.Day7;

public class DiffBtwString {
    public static char Diff(String s, String t){
        int res = 0;
        String add = s + t;
        for(int i = 0; i < add.length(); i++){
            System.out.print(add.charAt(i) + "-");
            res = res ^ add.charAt(i);
            System.out.print(res + " | ");
        }
        return (char) res;
    }
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcde";
        String res = a + b;
        System.out.println(res);
        System.out.println(Diff(a,b));
    }
}
