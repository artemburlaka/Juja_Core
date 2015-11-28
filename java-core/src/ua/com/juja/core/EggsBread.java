package ua.com.juja.core;

/**
 * Created by Artem on 21.11.2015.
 */
public class EggsBread {
    public static void main(String[] args) {
        boolean hasEggs = true;
        boolean hasBread = true;

        System.out.println(printPurchases(hasEggs, hasBread));

    }
    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        String purchases = "";
        if (hasEggs == true && hasBread == true) {
            purchases = "Bread," + "Eggs";
        }
        else if (hasEggs == true && hasBread == false) {
            purchases = "Eggs";
        }
        else if (hasEggs == false && hasBread == true) {
            purchases = "Bread";
        }
        else  {
            purchases = "";
        }

        return purchases;
    }
}
