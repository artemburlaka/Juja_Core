package ua.com.juja.core;

/**
 * Created by Artem on 21.11.2015.
 */
public class Lab3 {
    public static void main(String[] args) {
        int number = 5;

        System.out.println(getDayOfTheWeek(number));

    }

    public static String getDayOfTheWeek(int dayNum) {
        String day = "";
        switch (dayNum)
        {
            case (1):
                day = "Monday";
                break;
            case (2):
                day = "Tuesday";
                break;
            case (3):
                day = "Wednesday";
                break;
            case (4):
                day = "Thursday";
                break;
            case (5):
                day = "Friday";
                break;
            case (6):
                day = "Saturday";
                break;
            case (7):
                day = "Sunday";
                break;

            default:
                day = "";

        }


        return day;
    }
}
