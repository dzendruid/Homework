package Homework_2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {2,2,11,34,5,67,88,22,40};
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxElement)
                {
                    maxElement = arr[i];
                }
        }
        System.out.println(maxElement);
    }
}
