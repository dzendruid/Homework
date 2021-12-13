package Homework_2;

import java.util.Scanner;

public class Task3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task_3, please insert you number\n");
        int firstScan = scanner.nextInt();
        System.out.println("Please insert you next number\n");
        int secondScan = scanner.nextInt();
        Task3 task3 = new Task3();
        task3.userSum(firstScan,secondScan);
    }

    public void userSum (int scan1, int scan2)
    {


            for (int i = Math.min(scan1, scan2) + 1; i < Math.max(scan1, scan2); i++)
                {
                    System.out.println(i);
                }


    }


}
