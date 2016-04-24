package ua.com.juja.core;

/**
 * Created by Artem on 24.11.2015.
 * �� ���� �������� ���������� ������. ����������, ����� �������� ������������ ������, �������� �������� ������������� (������ 0)
 � �������� ������ ������ ���� ������ �� 2� ���������, ���
 - ������� �0 - ������ �������� ����� ������� �������
 - ������� �1 - ������ �������� ������ ������� �������
 ���� ����� �������� ��������� - ������� ����� �����. ���� � ������� ���� ������ ������� (��� ����� ������������) - ������� ������ ������.
 ��������
 lookFor([1, 1, 1]) = [0, 2]
 lookFor([0, 1, 1]) = [1, 2]
 lookFor([1, 1, 0]) = [0, 1]
 lookFor([0, -100, 1, 1, 0, -1]) = [2, 3]
 lookFor([1, 1, 0, 1, 1]) = [0, 1] // ���������� �����
 lookFor([0, -1, 0, -1]) = [] // ���� ������������� �����
 */
public class Vkus2 {
    public static void main(String[] args) {
        int [] array1 = {0, 3, -7, 14, 27, 34, -100, 4, 1, 3, 4};
//        int [] array1 = {-1};
        int [] array3 = lookFor(array1);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
    public static int[] lookFor(int[] array) {
//        int n = 0;
//        int nmax = -1;
//        int m = 0;
//        int mmax = -1;
//        int k = 0;
//        int kmax = -1;
//
//        for (int i=0 ; i < array.length; i++)
//        {
//            if (array[i] > 0)
//            {
//                n = i;
//                m = n;
//             //   if (array[i+1] > 0)
//             //   {
//                    for (int j = n+1; j< array.length ; j++)
//                    {
//                        if (array[j] > 0)
//                        {
//                            m = j;
//                        }
//                        else break;
//                    }
//              //  }
//                k=m-n;
//                if(k>kmax)
//                {
//                    kmax = k;
//                    nmax = n;
//                    mmax = m;
//                }
//
//            }
//
//        }
//        if(nmax == -1 && mmax == -1)
//        {
//            int [] array1 = {};
//            return array1;
//        }
//        else
//        {
//            int [] array1 = {nmax, mmax};
//            return array1;
//        }
//
        int[] koshmar = new int[2];
        int[] yVol = {-1, -1};
        int n = 0;
        int m = 0;
        int length = 0;
        int maxLength = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                n = i;
                for (int j = n+1; j < array.length; j++) {
                    if (array[j] > 0) {
                        m = j;
                    }
                    else break;
                }
                length = m - n;
                if ( length > maxLength )
                {
                    maxLength = length;
                    yVol[0] = n;
                    yVol[1] = m;
                }

            }
        }
        if(yVol[0] == -1 && yVol[1] == -1)
        {
            int [] array1 = {};
            return array1;
        }
        else
        return yVol;

    }
}
