package Recursion.Recursion2;

public class TowerOfHanoi {
    //TIme Complexity == O(2^n)
    public static void TowerofHanoi(int n, String src, String aux, String des){
        if(n == 1){
            System.out.println("Move Disk" + " " + n +" "+ "from" + " " +src + " "+"to" +" "+ des);
            return;
        }
        TowerofHanoi(n-1, src, des, aux);
        System.out.println("Move Disk" + " " + n +" "+ "from" + " " +src + " "+"to" +" "+ des);
        TowerofHanoi(n-1, aux, src, des);
        
    }
    public static void main(String[] args) {
        int n = 3;
        TowerofHanoi(n, "A", "B", "C");
    }
}
