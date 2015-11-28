package ua.com.juja.core;

/**
 * Created by Artem on 21.11.2015.
 */
public class Lab1bits {
    public static void main(String[] args) {
        int b = 0b10000000_00000000_00000000_00000001;
        int c = 0b11111111_11111111_11111111_11111111;
        System.out.println(b);
        System.out.println(c);
        System.out.println(leftShift(b));
    }
    public static int leftShift(int arg) {
        int a = 0;
        if (arg <= 0b11111111_11111111_11111111_11111111)
        {
            a = arg << 1;
            a++;
        }
        else {
             a = arg << 1;
             }
        return a;
    }

}
