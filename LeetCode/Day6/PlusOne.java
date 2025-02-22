package LeetCode.Day6;



public class PlusOne {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "-");
        }
    }
    public static int[] IntArr(int a){
        String str = String.valueOf(a);
        int res[] = new int[str.length()];

        for(int i = 0; i < str.length(); i++){
            res[i] = str.charAt(i) - '0';
        }
        return res;
    }
    public static int[] Plus(int arr[]){
        int n = arr.length;
       StringBuilder s = new StringBuilder(n);
       for(int i = 0; i < n; i++){
            s.append(arr[i]);
       }
       int res = Integer.parseInt(s.toString()) +  1;

       return IntArr(res);
    }
    public static void main(String[] args) {
        int arr[] = {9};
        printArr(Plus(arr));
    }
}
