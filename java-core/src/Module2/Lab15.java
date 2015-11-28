package Module2;

/**
 * Created by Artem on 25.11.2015.
 */
public class Lab15 {
    public static void main(String[] args) {
        int [] array1 = {3, 1, 2};
        sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
    public static void sort(int[] arr) {
        int min = 0;
        int n = -1;
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            min = arr[barrier];

            for (int index = barrier + 1; index < arr.length; index++) {

                if (arr[index] < min) {
                    min = arr[index];
                    n = index;
                }
            }
            int tmp = arr[barrier];
            arr[barrier] = arr[n];
            arr[n] = tmp;
        }
    }

}
