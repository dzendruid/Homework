package Homework_2;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int array [] = {2,-2,11,-34,5,-67,88,22,40};
        int summ = 0;
        for (int i = 0; i < array.length; i++)
        {
           if (array[i] > 0)
            {
                summ += array[i];
            }
        }
        System.out.println(summ);
    }
}
