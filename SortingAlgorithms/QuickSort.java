package SortingAlgorithms;

public class QuickSort {
    public static void PrintArr(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ " ");
        }
    }
    public static int Partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void Sort(int arr[], int low, int high){
        if(low < high){
            int pivot_index = Partition(arr,low,high);

        Sort(arr,low,pivot_index - 1);
        Sort(arr,pivot_index+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 9, 5, 2, 8 };
        int n = arr.length;
        Sort(arr, 0, n-1);
        PrintArr(arr);
    }
}
