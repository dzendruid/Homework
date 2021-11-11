package Homework_2;

import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {
        System.out.println("Task_1, please insert you number");
        Task1 task1 = new Task1();
        task1.resultLoop(task1.userScaner());
    }


    public int userScaner ()
    {
        Scanner loading = new Scanner(System.in);
        int userLoad = loading.nextInt();
        return userLoad;
    }

    public void resultLoop (int scan)
    {
        int firstItem = 0;
        int secondItem = 1;
        System.out.println(firstItem+ "\n" + secondItem);
        for (int i = 0; i < scan - 2; i++)
        {
            int summ = firstItem + secondItem;
            System.out.println(summ);
            firstItem = secondItem;
            secondItem = summ;

        }
    }


}


