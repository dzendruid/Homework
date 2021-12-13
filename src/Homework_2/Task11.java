package Homework_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {3, 67, 30, 55, 6, 90};
        int[] array2 = new int[5];
        int g = 0;
        Scanner userscan = new Scanner(System.in);
        int userScan = userscan.nextInt();
        if(userScan > array.length )
            {
                System.out.println("ERROR");
            }
        else
            {
                for (int i = 0; i < array.length; i++)
                {
                    if (userScan != i)
                    {
                        array2[g++] = array[i];
                    }
                }
                System.out.println(Arrays.toString(array2));
            }

    }


}
