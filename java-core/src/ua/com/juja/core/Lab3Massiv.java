package ua.com.juja.core;

/**
 * Created by Artem on 22.11.2015.
 */
public class Lab3Massiv {
    public static void main(String[] args) {
        //int [] array1 = {1, 3, 7, 14, 27, 100};
        int [] array1 = {1};
        System.out.println("array1.length = "+array1.length);
        //int [] array2 = {24, 33, 55, 66, 70, 90};
        int [] array2 = {2};
        System.out.println("array2.length = "+array2.length);
        for (int i = 0; i<=array1.length-1; i++)
        {
            System.out.println(array1[i]);
        }
        for (int i = 0; i<=array2.length-1; i++)
        {
            System.out.println(array2[i]);
        }
        merge(array1, array2);
        //System.out.println(merge(array1, array2));
    }
    public static int[] merge(int[] fst, int[] snd) {
        if (fst.length == 0 && snd.length == 0) {
            int[] result = new int[]{};
    //        System.out.println("result length = " + result.length);
            return result;
        }
        else {
            int[] result = new int[fst.length + snd.length];
        //    System.out.println("result length = " + result.length);
            int fstIndex = 0;
            int sndIndex = 0;
            while (fstIndex + sndIndex != result.length) {
                if (fst.length == 0) {
                    result[sndIndex] = snd[sndIndex++];
                }
                else if (snd.length == 0) {
                    result[fstIndex] = fst[fstIndex++];
                }

                else if (fst[fstIndex] < snd[sndIndex]) {
                    result[fstIndex + sndIndex] = fst[fstIndex++];
             //       System.out.println(result[fstIndex + sndIndex] + " - 1");
             //       if (fst[fstIndex] < snd[sndIndex]) {
             //           result[fstIndex + sndIndex] = fst[fstIndex++];
             //       fstIndex++;
                } else {
                    result[fstIndex + sndIndex] = snd[sndIndex++];
            //        System.out.println(result[fstIndex + sndIndex] + " - 2");
             //       sndIndex++;
                }
            }
            System.out.println(12321);
            return result;
        }

    }

}
