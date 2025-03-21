package LeetCode.Day10;

public class RangeSum {
    private int arr[];
    public  void Prefixsum(int arr[]){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        this.arr = arr;
    }
    public  int Rsum(int i , int j){
        if(i == 0) return arr[j];
        return arr[j] - arr[i-1];
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,7,78,7,4,3,32,2};
        RangeSum obj = new RangeSum();
        obj.Prefixsum(a);
        System.out.println(obj.Rsum(0, 11));
    }
}
