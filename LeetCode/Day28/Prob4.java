package LeetCode.Day28;



public class Prob4 {

    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for(String i : str){
            int p = Character.getNumericValue(i.charAt(i.length() - 1)) - 1;
            res[p] = i.substring(0,i.length() - 1);
        }
        return String.join(" ", res);
    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }
}