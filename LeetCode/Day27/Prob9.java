package LeetCode.Day27;

public class Prob9 {
    public static void print(char arr[]){
        for(char i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void print(boolean arr[]){
        for(boolean i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static String decodeMessage(String key, String message) {
        char map[] = new char[26];
        boolean used[] = new boolean[26];
        int idx = 0;
        for(char c : key.toCharArray()){
            if(c != ' ' && !used[c - 'a']){
                map[c - 'a'] = (char) ('a'+idx);
                used[c-'a'] = true;
                idx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : message.toCharArray()){
            if(c == ' '){
                sb.append(' ');
            }else{
                sb.append(map[c - 'a']);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String mes = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, mes));
    }
}
