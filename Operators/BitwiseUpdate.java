package Operators;

import java.util.Scanner;

public class BitwiseUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;//0101
        int pos = 2;
        int bitmask = 1 << pos;
        int operation = sc.nextInt();
        if(operation == 1){
            //Set
            System.out.println(bitmask | num);
        }else{
            //Clear
            System.out.println(~(bitmask) & num);
        }
        sc.close();
    }
}
