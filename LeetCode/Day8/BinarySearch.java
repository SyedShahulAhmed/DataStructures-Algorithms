package LeetCode.Day8;

public class BinarySearch {
    public static int BS(int nums[],int target){
        // int left = 0; 
        // int right = arr.length -1 ;
        // while(left <= right){
        //     int mid = (left + right)/2;
        //     if(arr[mid] < tar){
        //         right = mid -1;
        //     }else if(arr[mid] > tar){
        //         left = left+1;
        //     }
        //     return mid;
        // }
        // return -1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int tar = 4;
        System.out.println(BS(arr,tar));

    }
}