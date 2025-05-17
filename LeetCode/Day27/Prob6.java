package LeetCode.Day27;

public class Prob6 {
    public static void print(String arr[]){
        for(String i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static String convertDateToBinary(String date) {
        // String s[] = date.split("-");
        // for(int i = 0;  i < s.length; i++){
        //     int num = Integer.parseInt(s[i]);
        //     String bin = Integer.toBinaryString(num);
        //     s[i] = bin;
        // }
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < s.length; i++){
        //     if(i != s.length - 1){
        //         sb.append(s[i]);
        //         sb.append("-");
        //     }else{
        //         sb.append(s[i]);
        //     }
        // }
        // return sb.toString();
        String p[] = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < p.length; i++){
            if(i > 0) sb.append("-");
            sb.append(Integer.toBinaryString(Integer.parseInt(p[i])));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "2080-02-29";
        System.out.println(convertDateToBinary(s));
    }
}