package LeetCode.Day16;

public class Prob6 {
    public static int Operations(String s[]){
        int x = 0;
        for(String a : s){
            x += 44 -a.charAt(1);
        }
        return x;
    }
    public static void main(String[] args) {
        String s[] = {"++X","X++","++X","--X"};
        System.out.println(Operations(s));
    }
}
