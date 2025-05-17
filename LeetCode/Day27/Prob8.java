package LeetCode.Day27;

public class Prob8 {
    public static int maxFreqSum(String s) {
        boolean vowel[] = new boolean[26];
        for(char c : new char[]{'a', 'e', 'i', 'o', 'u'}){
            vowel[c-'a'] = true;
        }
        int vow[] = new int[26];
        int con[] = new int[26];
        for(char i : s.toCharArray()){
            int idx = i-'a';
            if(vowel[idx]){
                vow[idx]++;
            }else{
                con[idx]++;
            }
        }
        int m1 = 0;
        int m2 = 0;
        for(int i = 0; i < 26 ; i++){
            m1 = Math.max(m1, vow[i]);
            m2 = Math.max(m2, con[i]);
        }
        return m1+m2;
    }
    public static void main(String[] args) {
        String s ="successes";
        System.out.println(maxFreqSum(s));
    }
}
