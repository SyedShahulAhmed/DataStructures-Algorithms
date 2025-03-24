package ImpPatterns;

public class SlidingWindow {
    public static int SWindow(int nums[]) {
        int w = 4; // Window size
        int curr = 0;
        for (int i = 0; i < w; i++) {
            curr += nums[i];
        }
        int max = curr;
        for (int i = 1; i <= nums.length - w; i++) {
            curr = curr - nums[i - 1] + nums[i + w - 1];
            max = Math.max(max, curr); 
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {3, 8, 2, 5, 7, 6, 12};
        System.out.println(SWindow(arr));  
    }
}
