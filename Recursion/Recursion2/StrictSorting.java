package Recursion.Recursion2;

public class StrictSorting {
    public static boolean one(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] >= arr[i+1]){
                    return false;
                }
        }
        return true;
    }
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
        int arr[] = {1,2,3,4,5,6};
        boolean res = StrictSort(arr,0);
        System.out.println(res);
        System.out.println(one(arr));
    }
}
