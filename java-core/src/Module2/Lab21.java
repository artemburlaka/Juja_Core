package Module2;

/**
 * Created by Artem on 13.03.2016.
 */
public class Lab21 {
    public static void main(String[] args) {
        int[][] mA =
                {{33, 34, 12},
                        {33, 19, 10},
                        {12, 14, 17},
                        {84, 24, 51},
                        {43, 71, 21}};

        int[][] mB =
                {{10, 11, 34, 55},
                        {33, 45, 17, 81},
                        {45, 63, 12, 16}};
        mul(mA, mB);

    }
    public static int[][] mul(int[][] fst, int[][] snd) {
        int m = fst.length;
        int n = snd[0].length;
        int o = snd.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }

        /*for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }*/

        return res;

    }
}
