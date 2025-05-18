package LeetCode.Day27;



public class Prob10 {
  
    public static String restoreString(String s, int[] indices) {
        char c[] = s.toCharArray();
        for(int i = 0 ; i < c.length; i++){
            c[indices[i]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder(); 
        for(char a : c){
            sb.append(a);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int idx[] = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, idx));
       
    }
}
