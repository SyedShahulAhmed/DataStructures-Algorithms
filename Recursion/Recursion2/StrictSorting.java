package Recursion.Recursion2;

public class StrictSorting {
    // public static boolean one(int[] arr){
    //     for(int i = 0; i < arr.length; i++){
    //         for(int j = i+1; j < arr.length; j++){
    //             if(arr[i] >= arr[j]){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    public static boolean StrictSort(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return StrictSort(arr, idx + 1);
        }else{
           return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6};
        boolean res = StrictSort(arr,0);
        System.out.println(res);
    }
}
