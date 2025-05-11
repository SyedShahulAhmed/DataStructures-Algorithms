package LeetCode.Day26;

public class Prob3 {
    public static int minSwaps(String s) {
        // int c = 0;
        // Stack<Character> st = new Stack<>();
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == ']'){
        //         st.push(s.charAt(i));
        //     }else if(s.charAt(i) == '['){
        //         st.pop();
        //         c++;
        //     }
        // }
        // if(st.isEmpty()){
        //     System.out.println("Stack empty");
        // }
        // System.out.println(st);
        // return c-1;
        int bal = 0,maxBal=0;
        for(char c : s.toCharArray()){
            if(c == '['){
                bal++;
            }else{
                bal--;
                if(bal < 0){
                    maxBal = Math.max(maxBal, -bal);
                    System.out.println("MaxBal" + maxBal);
                }
            }
        }
        return (maxBal+1)/2;
    }
    public static void main(String[] args) {
        String s= "]]][[[";
        System.out.println(minSwaps(s));
    }
}
