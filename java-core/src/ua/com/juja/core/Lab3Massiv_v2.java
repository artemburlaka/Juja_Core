package ua.com.juja.core;

/**
 * Created by Artem on 22.11.2015.
 */
public class Lab3Massiv_v2 {
    public static void main(String[] args) {
        int [] array1 = {1, 3, 4};
        System.out.println("array1.length = "+array1.length);
        //int [] array2 = {24, 33, 55, 66, 70, 90};
        int [] array2 = {2, 5, 7};
        System.out.println("array2.length = "+array2.length);
//        for (int i = 0; i<=array1.length-1; i++)
//        {
//            System.out.println(array1[i]);
//        }
//        for (int i = 0; i<=array2.length-1; i++)
//        {
//            System.out.println(array2[i]);
//        }

        int[] arrResult = merge(array1, array2);
//        merge(array1, array2);
        for (int i = 0; i < arrResult.length; i++) {
            System.out.println(arrResult[i]);
        }
        System.out.println("End");
    }
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;


//        while (fstIndex + sndIndex != result.length) {
//            if (fst[fstIndex] < snd[sndIndex]) {
//                result[fstIndex + sndIndex] = fst[fstIndex++];
//            } else {
//                result[fstIndex + sndIndex] = snd[sndIndex++];
//            }
//        }


        while (fstIndex + sndIndex != result.length) {
            if (fstIndex == fst.length && sndIndex == snd.length)
            {
                break;
            }
            else if (fstIndex == fst.length)
            {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
            else if (sndIndex == snd.length)
            {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            }
            else if (fst[fstIndex] < snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        return result;
    }
}
