package Module2;

import java.util.Arrays;

/**
 * Created by Artem on 13.03.2016.
 */
public class Lab20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
    }
    public static void permutation(int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arr, k, size - 1);
                permutation(arr, size - 1);
                swap(arr, k, size - 1);

            }
        }
    }

    public static void swap(int[] arr, int index0, int index1) {
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}


   /* public static void permutation(int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arr, k, size - 1);
                int[] arr2 = Arrays.copyOf(arr,size-k-1);
                System.arraycopy(arr,k+1,arr2,k,size-k-1);
                permutation(arr2, size);
            }
        }
    }*/