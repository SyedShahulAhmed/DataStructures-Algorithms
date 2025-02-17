package LeetCode.Day1;

public class MajorityElement {
    public static int Major(int arr[]){
        int c = 0;
        int count = 0;

        for(int num : arr){
            if(count == 0){
                c = num;
            }if(num == c){
                count++;
            }else{
                count--;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,3,2,1,3};
        System.out.println(Major(arr));
    }
}
