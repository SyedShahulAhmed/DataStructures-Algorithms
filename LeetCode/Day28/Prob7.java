package LeetCode.Day28;

public class Prob7 {
    public static String replaceDigits(String s) {
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < s.length(); i++){
        //     char c = s.charAt(i);
        //     System.out.println("Iteration :- " + i);
        //     if(Character.isDigit(c)){
        //         System.out.println("Number Detected");
        //         int shift = c -'0';
        //         System.out.println(shift);
        //         char next = s.charAt(i-1);
        //         System.out.println(next);
        //         char ap = (char) (shift + next);
        //         System.out.println("Appending charcater : -" + ap);
        //         sb.append(ap);
        //     }else{
        //         System.out.println("Charcater Detected");
        //         sb.append(c);
        //     }
        // }
        // return sb.toString();
        char c[] = s.toCharArray();
        for(int i = 1; i < c.length; i+=2){
            c[i] = (char) (c[i - 1] + c[i] - '0');
        }
        return new String(c);
    }
    public static void main(String[] args) {
         String s = "a1c1e1";
         System.out.println(replaceDigits(s));
    }
}
