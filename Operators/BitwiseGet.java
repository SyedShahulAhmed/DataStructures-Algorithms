package Operators;

public class BitwiseGet {
    public static void main(String args[]){
        int num = 5;
        int pos = 3;
        int bitmask = 1 << pos;

        if((bitmask & num) == 0){
            System.out.println("Zero");
        }else{
            System.out.println("One");
        }
    }
    
}