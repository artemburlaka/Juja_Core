package Module2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Artem on 26.11.2015.
 */

public class Lab16 {
    public static void main(String[] args) {
        int[] arr = {2, 1, -4, 4, 19,0};

        /*int[] a = {1,2,3,4};
        int[] b = Arrays.copyOf(a,3);
        for (int i=0; i<b.length; i++)
            System.out.println(b[i]);*/

        sort(arr);
       /* int arr1[] = { 0, 1, 2, 3, 4, 5 };
        int arr2[] = { 0, 10, 20, 30, 40, 50 };

        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr2, 2, 1);
        System.out.print("array2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");
        System.out.print(arr2[5] + " ");*/
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Element "+i+" = "+arr[i]);
        }

    }
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int prevElement = arr[k - 1];
            int location = k - 1;
            if (newElement < prevElement)
            {
                int[] arr2 = Arrays.copyOf(arr, location+1);
                int m = Arrays.binarySearch(arr2, newElement);
                if (m < 0)
                    m = Math.abs(m)-1;
                System.out.println(m);
                System.out.println(arr2.length);
                System.arraycopy(arr2, m, arr, m+1, arr2.length-m);
                arr[m] = newElement;
            }
        }
    }

}

