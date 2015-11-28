package ua.com.juja.core;

/**
 * Created by Artem on 21.11.2015.
 */
public class Lab3bits {
    public static void main(String[] args) {
        // int a0 = Integer.MIN_VALUE;
        byte i = 0b00001110;
        int c = 0b10101010_10101010_10101010_10101010;

        System.out.println("i = " + i);
        System.out.println("new i swap1 = " + swap(i,0,3));
        System.out.println("new i swap2 = " + swap2(i, 0, 3));

       /* int temp1 = (i & 0x1) << 3; //extract lowest bit #1 and place at pos# 4
        System.out.println("temp1 = " + temp1);
        int temp2 = (i & 0x8) >> 3; //extract bit #4 and place at pos #1
        System.out.println("temp2 = " + temp2);
        i = (i & temp1) | (i & ~temp1); //now pos #4 is ready
        i = (i & temp2) | (i & ~temp2); //now pos #1 is ready

        System.out.println("new i 2 = " + i);
        */
    }
    public static int swap2(byte b, int i, int j) {
        byte n = 0;
        byte bit1 = (byte) ((b >> i) & 1);
        byte bit2 = (byte) ((b >> j) & 1);

        if (bit1 == bit2)
            return b;
        byte mask = (byte) ((1 << i) | (1 << j));
        n = (byte) (b ^ mask);
        return n;
    }

    static int swap(int x, int i, int j)
    {
        // precondition: i > j
        int d = Math.abs(i - j);
        int y = (x ^ (x >> d)) & (1 << j);
        return x ^ y ^ (y << d);
    }
}
