package ImpPatterns;

public class TwoPointers {
    public static boolean Tp(int arr[]){
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            if(arr[s] != arr[e]){
                return false;
            }else{
                s++;
                e--;
            }
       }
       return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,2,1};
        System.out.println(Tp(arr));
    }
}
