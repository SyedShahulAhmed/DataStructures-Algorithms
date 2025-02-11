package SortingAlgorithms;

public class MergeSort {
    public static void Conquer(int arr[], int intial, int mid, int end) {
        int Merged[] = new int[end - intial + 1];
        int idx1 = intial;
        int idx2 = mid + 1;
        int idx = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                Merged[idx] = arr[idx1];
                idx1++;
            } else {
                Merged[idx] = arr[idx2];
                idx2++;
            }
            idx++;
        }

        while (idx1 <= mid) {
            Merged[idx] = arr[idx1];
            idx1++;
            idx++;
        }
        
        while (idx2 <= end) {
            Merged[idx] = arr[idx2];
            idx2++;
            idx++;
        }

        for (int i = 0; i < Merged.length; i++) {
            arr[intial + i] = Merged[i]; // Corrected index
        }
    }

    public static void Divide(int arr[], int intial, int end) {
        if (intial >= end) {
            return;
        }
        int mid = intial + (end - intial) / 2;
        Divide(arr, intial, mid);
        Divide(arr, mid + 1, end);
        Conquer(arr, intial, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 6, 9, 8};
        int n = arr.length;
        Divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
