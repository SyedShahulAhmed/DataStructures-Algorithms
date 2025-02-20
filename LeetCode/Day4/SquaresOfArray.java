package LeetCode.Day4;

public class SquaresOfArray {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] Sqaure(int arr[]){
        int n = arr.length;
        int res[] = new int[n];

        int l[] = new int[n];
        int r[] = new int[n];
        l[0] = 1;
        for(int i = 1; i < n; i++){
            l[i] = l[i-1] * arr[i-1];
        }
        r[n - 1] = 1;
        for(int i = n-2; i >= 0; i--){
            r[i] = r[i+1] * arr[i+1];
        }
        for(int i = 0; i < n; i++){
            res[i] = l[i] * r[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,3};
        printArr(Sqaure(arr));
    }

}