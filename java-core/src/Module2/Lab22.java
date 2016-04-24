package Module2;

/**
 * Created by Artem on 13.03.2016.
 */
public class Lab22 {
    public static void main(String[] args) {
        /*int[][] arg =
                {{11, 12, 13},
                 {21, 22, 23},
                 {31, 32, 33}};*/
//        int[][] arg = null;


        rotateClockwise(new int[0][]);
//        rotateClockwise(arg);

        /*for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[0].length; j++) {
                System.out.format("%6d ", arg[i][j]);
            }
            System.out.println();
        }*/

    }

    public static int[][] rotateClockwise(int[][] arg) {

        if (arg == null) {
            return null;
        }

//        if (arg[0] == null) {
//            return null;
//        }

        if ((arg == null) || (arg.equals(null)) || (arg.length==0) || !(arg.length>=1) || (arg[0] == null) ) {
            return null;
        }

        for (int i = 0; i < arg.length; i++) {
            if ((arg[i] == null) || arg[i].length != arg.length) {
                    return null;
            }
        }

        if(arg.length == 1 ) {
            return arg;
        }

        int m = arg.length;
        int n = arg[0].length;
//        int o = snd.length;
        int[][] result = new int[m][n];


        //проверка на квадратность
        for (int i = 0; i < arg.length; i++) {
            if(arg[i].length != arg.length )
            {
                return null;
            }
        }



        //переворачиваем
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arg[m-j-1][i];
            }
        }
//        System.out.println(result[0][0]);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.format("%6d ", result[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        return result;
    }
}
