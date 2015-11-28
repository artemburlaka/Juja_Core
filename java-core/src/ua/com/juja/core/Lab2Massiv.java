package ua.com.juja.core;

/**
 * Created by Artem on 21.11.2015.
 */
public class Lab2Massiv {
    public static void main(String[] args) {
        int [] array = {4, 3, 5, 6, 7, 9};
        for (int i = 0; i<=array.length-1; i++)
        {
            System.out.println(array[i]);
        }
        filterEven(array);

    }
    public static int [] filterEven(int [] nums){
        int []newArray = new int[nums.length];
        int n = 0;
        for(int i = 0; i<=nums.length-1; i++)
        {
            if(nums[i] %2 == 0)
            {
                newArray[n] = nums[i];
                //System.out.println(newArray[n]);
                n++;

            }
        }
        return newArray;
    }
}
