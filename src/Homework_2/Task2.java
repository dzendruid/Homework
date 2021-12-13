package Homework_2;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {
        System.out.println("Task_2, please insert you number");
        Scanner scanner = new Scanner(System.in);
        Task2 task2 = new Task2();
        task2.switchUser(scanner.nextInt());
    }

    public void  switchUser (int scan)
    {
        switch (scan)
            {
                case 1:
                        System.out.println(scan + " день");
                        break;
                case 2,3,4:
                        System.out.println(scan + " дня");
                        break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                        System.out.println(scan + " дней");
                        break;
                default:
                    if (scan < 0)
                        {
                            System.out.println("ERRROOORR!!!");
                        }
                    else {
                            System.out.println("Value is not avalible for this case");
                            break;
                    }

            }

    }



}
