package LeetCode.Day1;

public class SingleNumber {
    public static int SingleNum(int arr[]){
        int sn = 0;
        for(int n : arr){
            sn = sn ^ n;
        }
        return sn;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5,3,5};
        System.out.println(SingleNum(arr));
    }
}
