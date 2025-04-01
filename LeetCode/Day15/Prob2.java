package LeetCode.Day15;

public class Prob2 {
    public static String reveString(String s, int k){
        char c[] = s.toCharArray();
        int n = c.length;
        for(int i = 0; i < n; i+=2*k){
            int l = i;
            int r = Math.min(i+k-1,n-1);
            while(l < r){
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
        }
        return new String(c);
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reveString(s, 2));
    }
}
