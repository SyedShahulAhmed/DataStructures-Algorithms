package LeetCode.Day28;

public class Prob9 {
    public static int countSeniors(String[] details) {
        int c = 0 ;
        // for(String s : details){
        //   int age = Integer.parseInt(s.substring(11, 13));
        //   if(age > 60) {
        //     c++;
        //   }
    // }
    for(String s : details){
        int a = s.charAt(11);
        int b = s.charAt(12);
        if((a*10) + b > 60) c++;
    }
    return c;
}
    public static void main(String[] args) {
        String s[] = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(s));
    }
}
