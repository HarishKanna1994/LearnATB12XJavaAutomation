package ex09_Switch;

import java.util.Scanner;

public class Lab069_Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
        int day = scanner.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
        }
    }
}

//if I enter numbers other than 1 and 2, then it will return nothing (No Output)
