package BigNumbers_33_37;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by Artem on 01.01.2016.
 */
public class TestForLab36 {
    @Test
    public void test1_1() {

        BigInteger[] x = {
                new BigInteger("1")
        };
        BigInteger[] y = {
                new BigInteger("1")
        };

        BigInteger[] expected = {
                new BigInteger("1")
        };
        assertEquals(x, y, expected);

    }

    @org.junit.Test
    public void test1_1__1() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        assertEquals(x, y, expected);

    }

    @org.junit.Test
    public void test1__1_1() {

        BigInteger[] x = {
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        assertEquals(x, y, expected);

    }

    @org.junit.Test
    public void test1_1__1_0() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("0"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("0"),
        };
        assertEquals(x, y, expected);

    }

    @org.junit.Test
    public void testminus10_0_1__munis1_0() {

        BigInteger[] x = {
                new BigInteger("10"),
                new BigInteger("0"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("-1"),
                new BigInteger("0"),
        };

        BigInteger[] expected = {
                new BigInteger("-10"),
                new BigInteger("0"),
                new BigInteger("-1"),
                new BigInteger("0"),
        };
        assertEquals(x, y, expected);

    }


    @org.junit.Test
    public void test1_2__3_4() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("2"),
        };
        BigInteger[] y = {
                new BigInteger("3"),
                new BigInteger("4"),
        };

        BigInteger[] expected = {
                new BigInteger("3"),
                new BigInteger("10"),
                new BigInteger("8"),
        };

        assertEquals(x, y, expected);
    }


    @org.junit.Test
    public void test1_1__1_1_1() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("2"),
                new BigInteger("1"),
        };

        assertEquals(x, y, expected);

    }

    private void assertEquals(BigInteger[] x, BigInteger[] y, BigInteger[] expected) {
        BigInteger[] actual = Lab36.mul(x, y);

        String ex = Arrays.toString(expected);
        String act = Arrays.toString(actual);
        assertArrayEquals("expected: " + ex + ", but: " + act, expected, actual);
//        System.out.println("expected: " + ex + ", but: " + act, expected, actual);

    }
}
