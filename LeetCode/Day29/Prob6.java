package LeetCode.Day29;


public class Prob6 {
     public static int minimumChairs(String s) {
        int c = 0;
        int max = 0;
        for(char i : s.toCharArray()){
            if(i == 'E'){
                c++;
                max = Math.max(max, c);
            }else{
                c--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "EEEEEEE";
        System.out.println(minimumChairs(s));
    }
}