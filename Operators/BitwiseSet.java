package Operators;

public class BitwiseSet {
    public static void main(String[] args) {
        int num = 5;//0101
        int pos = 2;
        int bitmask = 1 << pos;

        int NewNum = bitmask | num;
        System.out.println(NewNum);
    }
}
