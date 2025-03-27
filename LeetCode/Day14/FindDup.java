package LeetCode.Day14;

public class FindDup {
    public static int Duplicate(int arr[]){
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,3,2};
        System.out.println(Duplicate(arr));
    }
}
