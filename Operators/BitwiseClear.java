package Operators;

public class BitwiseClear {
    public static void main(String[] args) {
        int num = 5;//0101
        int pos = 2;
        int bitmask = 1 << pos;
        int Notmask = ~(bitmask);
        int NewNum = Notmask & num;
        System.out.println(NewNum);
    }
}
