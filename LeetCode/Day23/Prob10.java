package LeetCode.Day23;

public class Prob10 {

    public static int maximum69Number (int num) {
        char c[] = Integer.toString(num).toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] == '6'){
                c[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(c));
    }
    public static void main(String[] args) {
        System.out.println(maximum69Number(9969));
    }
}
