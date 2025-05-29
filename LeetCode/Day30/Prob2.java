package LeetCode.Day30;

public class Prob2 {
    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int i : nums){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }else if(i > max2){
                max2 = i;
            }
        }
        System.out.println("Max 1 :-" + max1);
        System.out.println("Max 2 :-" + max2);
        int prod = (max1 - 1) * (max2 - 1);
        return prod;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
}
