package Module2;

/**
 * Created by Artem on 29.11.2015.
 */
public class Lab19 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 5;
        int d = 10;
        int e = 25;
        int f = 50;
        int grn = 100;

        System.out.println("1 kop = "+exchangeAmountOfCoinsBrutForce(a));
        System.out.println("2 kop = "+exchangeAmountOfCoinsBrutForce(b));
        System.out.println("5 kop = "+exchangeAmountOfCoinsBrutForce(c));
        System.out.println("10 kop = "+exchangeAmountOfCoinsBrutForce(d));
        System.out.println("25 kop = "+exchangeAmountOfCoinsBrutForce(e));
        System.out.println("50 kop = "+exchangeAmountOfCoinsBrutForce(f));
        System.out.println("100 kop = "+exchangeAmountOfCoinsBrutForce(grn));




    }
    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {

        if (amountForExchange == 0) {
            return 0;
        }

        int a = 1;
        int b = 2;
        int c = 5;
        int d = 10;
        int e = 25;
        int f50 = 50;
        int ia = 0;
        int ib = 0;
        int ic = 0;
        int id = 0;
        int ie = 0;
        int if50 = 0;

        int result = 0;
        int count = 0;
        while (if50 <= amountForExchange)
        {
            if (ie >= amountForExchange)
                ie = 0;
            while (ie <= amountForExchange)
            {
                if (id >= amountForExchange)
                    id = 0;
                while (id <= amountForExchange)
                {
                    if (ic >= amountForExchange)
                        ic = 0;
                    while (ic <= amountForExchange)
                    {
                        if (ib >= amountForExchange)
                            ib = 0;
                        while (ib <= amountForExchange)
                        {
                            if (ia >= amountForExchange)
                                ia = 0;
                            while (ia <= amountForExchange)
                            {
                                if ((if50 + ie + id + ic + ib + ia ) == amountForExchange) {
                                    result++;
                                }
                                count++;
                                ia++;
                            }
                            ib = ib + 2;
                        }
                        ic = ic + 5;
                    }
                    id = id + 10;
                }
                ie = ie + 25;
            }
            if50 = if50 + 50;

        }
   //     System.out.println("count = " + count);

        return result;
    }

}
