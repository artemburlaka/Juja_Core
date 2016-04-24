package Exceptions_38_39;

/**
 * Created by Artem on 24.01.2016.
 */
public class Lab38 {
    public static boolean transfer(Account[] accounts, int[] delta) {

        for (int k = 0; k < accounts.length; k++) {
            try {

                accounts[k].change(delta[k]);

            } catch (TryAgainException e) {
                k--;

            } catch (BlockAccountException e) {
                for (int i = k-1; i >= 0; i--) {
                    try {
                        accounts[i].change(-delta[i]);

                    } catch (TryAgainException e1) {
                        e1.printStackTrace();
                    } catch (BlockAccountException e1) {
                        e1.printStackTrace();
                    }
                }

                return false;
            }

        }
        return true;
    }
    /*{
        int len = accounts.length;
        int checker = 0;
        try {
            for (int k = 0; k < accounts.length; k++) {
                accounts[k].change(delta[k]);
                checker++;
            }
            return true;
        } catch (TryAgainException e) {
            int newLen = len - checker;
            Account[] newAccounts = new Account[newLen];
            int[] newDelta = new int[newLen];
            for (int i = 0; i < newLen; i++) {
                newAccounts[i] = accounts[checker];
                newDelta[i] = delta[checker];
                checker++;
            }
            transfer(newAccounts, newDelta);
        } catch (BlockAccountException e) {
            for (int i = 0; i < checker; i++) {
                //X3
            }
        }
        return false;
    }*/

}

abstract class Account {
    protected int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public abstract void change(int delta) throws TryAgainException, BlockAccountException;

    public int getAmount() {
        return amount;
    }
}


class TryAgainException extends Exception {
}

class BlockAccountException extends Exception {
}
