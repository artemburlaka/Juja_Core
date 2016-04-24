package BigNumbers_33_37;

import java.math.BigInteger;

/**
 * Created by Artem on 31.12.2015.
 */
public class Lab33 {
    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {

            int x0 = x[0].intValue() * y[1].intValue();
            int second = x[1].intValue() * y[1].intValue();
            int y0 = y[0].intValue() * x[1].intValue();
            int first = x0 + y0;
            BigInteger firstBI = new BigInteger(String.valueOf(first));
            BigInteger secondBI = new BigInteger(String.valueOf(second));
            BigInteger gcd = firstBI.gcd(secondBI);
            if (gcd.intValue() != 1) {
                first = first / gcd.intValue();
                second = second / gcd.intValue();
            }
            BigInteger[] result = {new BigInteger(String.valueOf(first)), new BigInteger(String.valueOf(second))};
            return result;
    }
}




//        BigInteger secondBig = x[1].gcd(y[1]);
//        System.out.println("secondBig = " + secondBig.intValue());
//
//        if(secondBig.intValue() != 1) {
//            int xA = x[0].intValue() / secondBig.intValue();
//            int x0 = x[0].intValue() / xA;
//            int yA = y[0].intValue() / secondBig.intValue();
//            int y0 = y[0].intValue() / yA;
//            int first = x0 + y0;
//            BigInteger[] result = {new BigInteger(String.valueOf(first)), new BigInteger(String.valueOf(secondBig))};
//            return result;
//        }
//        else {
//            int x0 = x[0].intValue() * y[1].intValue();
//            int x1 = x[1].intValue() * y[1].intValue();
//            int y0 = y[0].intValue() / x[1].intValue();
//            int sumx0y0 = x0 + y0;
////            int y1 = y[0].intValue() / yA;
//            BigInteger[] result = {new BigInteger(String.valueOf(sumx0y0)), new BigInteger(String.valueOf(x1))};
//            return result;
//        }

//        int second = x[1].intValue() + y[1].intValue();

//        BigInteger[] sum = {new BigInteger(String.valueOf(first)), new BigInteger(String.valueOf(second))};
//        return sum;
