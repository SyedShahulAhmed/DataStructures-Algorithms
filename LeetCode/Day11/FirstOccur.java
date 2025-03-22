package LeetCode.Day11;

public class FirstOccur {
    public static int str(String s, String b){
        int m = s.length();
        int n = b.length();
        if(m < n) return -1;

        for(int i = 0; i <= m - n; i++){
            int j = 0;

            while(j < n && s.charAt(i+j) == b.charAt(j)){
                j++;
            }
            if(j==n) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "sadbutsad";
        String b = "sad";
        System.out.println(str(s, b));
    }
}
