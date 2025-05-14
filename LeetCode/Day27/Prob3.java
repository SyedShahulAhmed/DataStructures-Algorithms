package LeetCode.Day27;

public class Prob3 {
    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static int[] decode(int[] encoded, int first) {
        int res[] = new int[encoded.length + 1];
        res[0] = first;
        for(int i = 1 ; i < res.length; i++){
            res[i] = res[i-1] ^ encoded[i-1];
            System.out.println(res[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        print(decode(arr, 1));
    }
}
