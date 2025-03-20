package ImpPatterns;

public class PrefixSum {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void Prefix(int arr[]){
        // int newArr[] = new int[arr.length];
        for(int i = 1; i < arr.length; i++ ){
            arr[i] = arr[i - 1] + arr[i];
        }
        printArr(arr);
    }
    public static int Range(int i, int j,int arr[]){
            if(i == 0){
                System.out.println("Element is " + j);
                return arr[j];
            }
            System.out.println("Element are " + i + "and" + j);
            return arr[j] - arr[i-1];
        }
    public static void Preview(int nums[]){
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        printArr(nums);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Preview(arr);
        System.out.println(Range(4, 5, arr));
        
    }
}
