package ex08_IfCondition;

import java.util.Scanner;

public class Lab067_IfelseScanner {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>18) {
            System.out.println("You can vote");
        }else
            System.out.println("You can't vote");

    }

}
