package BigNumbers_33_37;

import java.math.BigInteger;

/**
 * Created by Artem on 01.01.2016.
 */
public class Lab36 {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {

        BigInteger[] result = new BigInteger[x.length + y.length-1];
        for (int index = 0; index < x.length + y.length - 1; index++) {
            result[index] = new BigInteger("0");
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                    result[i + j] = BigInteger.valueOf(result[i + j].intValue() + (x[i].intValue() * y[j].intValue()));
            }
        }
        return result;
    }
}
