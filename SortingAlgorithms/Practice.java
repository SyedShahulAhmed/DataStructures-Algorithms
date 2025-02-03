package SortingAlgorithms;

public class Practice {
    public static void PrintArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 8, 6, 12, 1, 2 };
        // for(int i = 0; i < arr.length-1; i++){
        // for(int j = 0; j < arr.length - 1-i; j++){
        // if(arr[j] > arr[j+1]){
        // int temp = arr[j];
        // arr[j] = arr[j+1];
        // arr[j+1]= temp;
        // }
        // }
        // }
        // for(int i = 0; i < arr.length; i++){
        // System.out.print(arr[i] + " ");
        // }
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int small = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[small] > arr[j]) {
        //             small = j;
        //         }
        //     }
        //     int temp = arr[small];
        //     arr[small] = arr[i];
        //     arr[i] = temp;

        // }
        // for (int k = 0; k < arr.length; k++) {
        //     System.out.print(arr[k] + " ");
        // }
        // for(int i = 1; i < arr.length; i++){
        //     int cur = arr[i];
        //     int j = i -1;
        //     while(j >= 0 && cur < arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = cur;
        // }
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        //BubbleSort :-

        // for(int i = 0; i < arr.length - 1; i++){
        //     for(int j = 0; j < arr.length - 1- i; j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // System.out.println("Bubble sort :-");
        // PrintArr(arr);

        //Selection Sort :-
        // for(int i = 0; i < arr.length; i++){
        //     int min = i;
        //     for(int j = i + 1; j < arr.length; j++){
        //         if(arr[min] > arr[j]){
        //             min = j;
        //         }
        //     }
        //     int temp = arr[min];
        //     arr[min] = arr[i];
        //     arr[i] = temp;
        // }
        // System.out.println("Selection Sort :- ");
        // PrintArr(arr);

        //Insertion Sort:-

        for(int i = 1; i < arr.length; i++){
            int cur = arr[i];
            int j = i - 1;
            while(j >= 0 && cur < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = cur;
        }
        System.out.println("Insertion Sort :-");
        PrintArr(arr);
    }
}
