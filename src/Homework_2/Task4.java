package Homework_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int array [] = {2,2,11,34,5,67,88,22,40};
        int array2 [] = new int[9];
        for (int i = 0; i < array.length; i++)
            {
                int check = array[i];
                int num = check%2;

                if (num == 0)
                    {
                        array2[i] = check;
                    }
            }
        int summ = 0;
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++)
        {
            summ += array2[i];
        }

        System.out.println(summ);
    }
}
