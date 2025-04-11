package LeetCode.Day17;

public class Prob7 {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for(int i = 0; i < hours.length; i++){
            if(hours[i] <= target){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4};
        System.out.println(numberOfEmployeesWhoMetTarget(arr, 2));
    }
}
