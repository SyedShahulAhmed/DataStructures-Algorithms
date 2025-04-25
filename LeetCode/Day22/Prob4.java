package LeetCode.Day22;

public class Prob4 {
    public static boolean isPrime(int n){
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void printBool(boolean n[]){
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println(" ");
    }
    public static int countPrimes(int n) {
        // int i = 0 ;
        // int c = 0;
        // while(i < n){
        //     if(isPrime(i)) c++;
        //     i++;
        // }
        // return c;
        boolean seen[] = new boolean[n];
        int c = 0;
        for(int i = 2; i < n; i++){
            if(seen[i] == false){
                c++;
            }
            for(int j = 2; i*j < n; j++){
                seen[i*j] = true;
            }
        }
        printBool(seen);
        return c;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
}
