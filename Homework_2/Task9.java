package Homework_2;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner userscan = new Scanner(System.in);
        Random rand = new Random();

        int genRandom = rand.nextInt(5);
        int genUser;
        do
            {
                System.out.println("Insert you number");
                genUser = userscan.nextInt();
            }
        while (genRandom != genUser);
        System.out.println("Yes you WON");


    }
}
