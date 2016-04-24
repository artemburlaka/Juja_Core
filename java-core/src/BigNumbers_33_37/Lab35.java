package BigNumbers_33_37;

import java.math.BigInteger;

/**
 * Created by Artem on 01.01.2016.
 */
public class Lab35 {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {

        int result = 0;
        int xCount = poly.length - 1;
        for (int i = 0; i < poly.length; i++) {
            result = result + poly[i].intValue() * (arg.pow(xCount).intValue());
            xCount--;
        }
        BigInteger resultBI = new BigInteger(String.valueOf(result));
        return resultBI;
    }
}
