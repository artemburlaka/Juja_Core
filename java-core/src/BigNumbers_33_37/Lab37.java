package BigNumbers_33_37;

/**
 * Created by Artem on 02.01.2016.
 */
public class Lab37 {
    public static String rightShift(String arg, int delta) {

        if (arg.equals("")) {
            return "";
        }
        else {
            char[] sChar = arg.toCharArray();
            char temp;
            int newNum = delta % sChar.length;
            if (newNum < 0) {
                newNum = sChar.length + newNum;
            }
            for (int i = 1; i <= newNum; i++) {
                for (int j = 1; j < sChar.length; j++) {
                    temp = sChar[j];
                    sChar[j] = sChar[0];
                    sChar[0] = temp;
                }
            }
            return new String(sChar);
        }
    }
}


/*
                if (j == sChar.length-1) {
                    temp = sChar[j];
                    sChar[j] = sChar[0];
                    sChar[0] = temp;
                }
                else {
                    temp = sChar[j];
                    sChar[j] = sChar[j - 1];
                    sChar[j - 1] = temp;
                }*/