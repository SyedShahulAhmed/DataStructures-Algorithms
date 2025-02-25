package LeetCode.Day9;

public class RemoveDuplicates {
    public static int removeDup(int arr[]){
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[count-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int arr[] = {1,1,2,2,3,3};
       int k = removeDup(arr);
        for(int i = 0; i < k; i++){
            System.out.println(arr[i]);
        }
    }
}
