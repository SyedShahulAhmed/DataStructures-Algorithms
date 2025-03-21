package LeetCode.Day10;

public class SubArrSum {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] prefix(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n]; // 0-based prefix sum array
        prefix[0] = arr[0];

        // Compute prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int i, int j, int prefix[]) {
        if (i == 0) return prefix[j];  // Sum from index 0 to j
        return prefix[j] + prefix[i - 1]; // ✅ Corrected formula
    }

    public static int sumAdjacentPairs(int arr[]) {
        int n = arr.length;
        int prefix[] = prefix(arr); // Compute prefix sum only once
        int sum = 0;

        printArr(prefix); // Debugging: Print prefix array

        // Sum only adjacent pairs (subarrays of length 2)
        for (int i = 0; i < n - 1; i++) {
            sum += rangeSum(i, i + 1, prefix);
        }

        return sum;
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 1, 2};
        System.out.println("Final Sum: " + sumAdjacentPairs(a)); // Output: 13
    }
}
