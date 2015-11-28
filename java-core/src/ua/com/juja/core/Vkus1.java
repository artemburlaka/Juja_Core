package ua.com.juja.core;

/**
 * Created by Artem on 21.11.2015.
 */
public class Vkus1 {
    public static void main(String[] args) {
        int max = 1;
        System.out.println(lookFor(max));
    }

    private static int lookFor(int max) {
        int n = 0;
        int na = (int) Math.sqrt(max);
        //System.out.println(na);
        for(int k = 1; k <= na; k++)
        {
            for(int l = 1; l<=na; l++)
            {
                if ((k*k + l*l )<=max)
                {
                    n++;
                }
            }
        }

        return n;
    }

}
