package Recursion.Recursion2;

public class Occurence {
    public static int Start = -1;
    public static int End = -1;
    public static void Occurrance(String s, int idx, char ele){
        if(idx == s.length()){
            System.out.println("First :" + Start);
            System.out.println("Last :" + End);
            return;
        }
        char curr = s.charAt(idx);
        if(curr == ele){
            if(Start == -1){
                Start = idx;
            }else{
                End = idx;
            }
        }
        Occurrance(s, idx+1, ele);

    }
    public static void main(String[] args) {
        String s = "abbbsaavcdajha";
        // int start = -1;
        // int end = -1;
        // char ele = 'a';
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == ele) {
        //         if (start == -1) {
        //             start = i;
        //             System.out.println("First Ocuurence " + start);
        //         } else {
        //             end = i;
        //         }
        //     }
        // }
        // if (end != 0) {
        //     System.out.println("Last Ocurrence " + end);
        // }
        Occurrance(s, 0 , 'a');
    }
}