package LeetCode.Day10;

import java.util.HashMap;
import java.util.Map;

public class SubArr {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void prefix(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
    }
    public static int Own(int nums[],int k){
        prefix(nums);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == k ){
                count=count+2;
            }
        }
        return count;
    }
    public static int SubArray(int nums[], int k) {
        prefix(nums);
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) { 
                count++;
            }
            for (int j = 0; j < i; j++) { 
                if (nums[i] - nums[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
    // BruteForce
    public static int Brute(int nums[],int k){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    } 
    // Optimal
     public static int subarraySum(int[] arr, int k) {
        // Map to store prefix sums and their frequencies
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);  // To handle cases where a subarray itself equals k

        int preSum = 0;  // To store the running prefix sum
        int count = 0;    // Count of valid subarrays

        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];  // Add the current element to the running sum

            // Check if there's a prefix sum that makes (preSum - k)
            int remove = preSum - k;

            // If such a prefix sum exists, add its frequency to the count
            count += prefixMap.getOrDefault(remove, 0);

            // Store/update the frequency of the current prefix sum
            prefixMap.put(preSum, prefixMap.getOrDefault(preSum, 0) + 1);
        }

        return count;  // Return the total number of valid subarrays
    }
    public static int sumarr(int nums[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int presum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            presum += nums[i];  
            int remove = presum - k;
            count += map.getOrDefault(remove, 0);

            map.put(presum, map.getOrDefault(map, 0)+1);
        } 
        return count;
    }
    public static void main(String[] args) {
        int a[] = {1,2,1,2,1};
        int b[] = {9,4,20,3,10,5};
        // System.out.println(SubArray(a, 3)); // Output: 4
        System.out.println(Brute(b, 33));
        System.out.println(Own(a, 3));
        System.out.println(sumarr(b, 33));
    }
}
