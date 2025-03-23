package LeetCode.Day11;

public class ContainerPro {
    public static int ContainerWater(int nums[]){
        int max = 0;
        int s = 0;
        int e = nums.length - 1;
        while(s < e){
            int w = e - s;
            int h = Math.min(nums[s],nums[e]);
            int area = w * h;
            max = Math.max(max, area);
            if(nums[s] < nums[e]){
                s++;
            }else{
                e--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(ContainerWater(arr));
    }
}
