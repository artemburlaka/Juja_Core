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
//        System.out.println("10 kop = "+exchangeAmountOfCoinsBrutForce(d));
//        System.out.println("25 kop = "+exchangeAmountOfCoinsBrutForce(e));
//        System.out.println("50 kop = "+exchangeAmountOfCoinsBrutForce(f));
//        System.out.println("100 kop = "+exchangeAmountOfCoinsBrutForce(grn));


    }
    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {


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
        while (ia <= amountForExchange/a)
        {
            while (ib <= amountForExchange/b)
            {
                while (ic <= amountForExchange/c)
                {
//                    while (id <= amountForExchange/d)
//                    {
//                        while (ie <= amountForExchange/e)
//                        {
//                            while (if50 <= amountForExchange/f50)
//                            {
//                                if50 = if50 + 50;
//                                if (if50 == amountForExchange)
//                                    result++;
//                            }
//                            ie = ie + 25;
//                            if (if50 > amountForExchange)
//                                if50 = 0;
//                            if (ie == amountForExchange)
//                                result++;
//                        }
//                        id = id + 10;
//                        if (ie > amountForExchange)
//                            ie = 0;
//                        if (id == amountForExchange)
//                            result++;
//                    }
                    ic = ic + 5;
//                    if (id > amountForExchange)
//                        id = 0;
                    if (ic == amountForExchange)
                        result++;
                }
                ib = ib + 2;
                if (ic > amountForExchange)
                    ic = 0;
                if (ib == amountForExchange)
                    result++;
            }
            ia++;
            if (ib > amountForExchange)
                ib = 0;
            if (ia == amountForExchange)
                result++;
        }

        return result;
    }

}
