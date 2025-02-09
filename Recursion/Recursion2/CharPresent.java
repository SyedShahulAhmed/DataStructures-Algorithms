package Recursion.Recursion2;

public class CharPresent {
    public static boolean[] map = new boolean[26];

    public static void RemoveDuplicate(String s, int idx, String res){
        if(idx == s.length()){
            System.out.println(res);
            return;
        }
        char cur = s.charAt(idx);
        if(map[cur - 'a']){
            RemoveDuplicate(s,idx+1,res);
        }else{
            res += cur;
            map[cur - 'a'] = true;
            RemoveDuplicate(s, idx+1, res);
        }
    }
    public static void main(String[] args) {
        String s = "abcadb";
        // StringBuilder res = new StringBuilder("");
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //    if(res.indexOf(String.valueOf(ch)) == -1){
        //         res.append(ch);
        //    }
        // }
        // System.out.println(res);
        RemoveDuplicate(s, 0, "");
    }
}
