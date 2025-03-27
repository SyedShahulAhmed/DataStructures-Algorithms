package ImpPatterns;

public class Fast_Slow_Pattern {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int s = 0;
        int f = 0;
        while (f < arr.length-1) {
            
            s++;
            f = f + 2;
        }
        System.out.println(arr[s]);
    }
}