package LeetCode.Day29;



public class Prob9 {
    public static int minimizedStringLength(String s) {
        // Set<Character> set = new HashSet<>();
        // for(char c : s.toCharArray()){
        //     set.add(c);
        // }
        // return set.size();
        boolean count[] = new boolean[26];
        for(char i : s.toCharArray()){
            count[i - 'a'] = true;
        }
        int c = 0;
        for(boolean i : count){
            if(i) c++;
        }
        return c;
    }
    public static void main(String[] args) {
        String s = "baadccab";
        System.out.println(minimizedStringLength(s));
    }
}
