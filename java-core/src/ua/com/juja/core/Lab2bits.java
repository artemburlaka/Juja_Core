package ua.com.juja.core;

/**
 * Created by Artem on 21.11.2015.
 */
public class Lab2bits {
    public static void main(String[] args) {
        int a0 = Integer.MIN_VALUE;
        int b = 0b10000000_00000000_10000000_00000000;
        int bn = 0b01000000_00000000_01000000_00000000;
        int c = 0b10101010_10101010_10101010_10101010;
        int c0 = 0b01010101_01010101_01010101_01010101;
        int c10 = -1;
        int b2 = 0b11111111_11111111_01111111_11111111;
        int c2 = 0b11111111_11111111_10111111_11111111;
        System.out.println("a0 = " + a0);
        System.out.println("b = " + b);
        System.out.println("bn = " + bn);
        System.out.println("c = " + c);
        System.out.println("c0 = " + c0);
        System.out.println("c >> 1 = " + (c >>> 1));
        System.out.println("c2 = " + c2);
        System.out.println("c10 %2 =  " + c10%2);
        System.out.println("b2 = " + b2);
        System.out.println("c2 = " + c2);
        System.out.println("c = " + rightShift(b2));
    }
    public static int rightShift(int arg) {
        int a = 0;
        if (arg %2 == 1 && arg > 0)
        {
            a = Integer.MIN_VALUE + arg/2;
        }
        else if (arg %2 == -1)
        {
            a = arg/2 - 1;
        }
        else if (arg %2 == 0 && arg < 0){
            a = Math.abs(arg >>> 1);
            //a = Math.abs(arg);
            //a = arg/2 - 1;

        }
        else if (arg %2 == 0 && arg > 0){
            a = arg >> 1 ;

        }
        return a;
    }
}
