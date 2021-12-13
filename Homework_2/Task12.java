package Homework_2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int value = 0;
        Scanner userscan = new Scanner(System.in);
        String userScan = "";

        while (!userScan.equals("exit"))
            {
                userScan = userscan.next();
                switch(userScan)
                    {
                        case "increase":
                            value++;
                            System.out.println(value);
                            break;

                        case "decrease":
                            value--;
                            System.out.println(value);
                            break;
                        case "exit":
                            break;
                        default:
                            System.out.println("ERRRROR!!! You can better try again");
                    }
            }
        System.out.println("command exit good buye");
    }
}
