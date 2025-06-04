package ex11_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab104_WhileGuessinggame {
    public static void main(String[] args) {

        Random random = new Random();
        int numbertoguess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int guess;
        int attempts = 0;
        while (true) {
            guess = scanner.nextInt();
            attempts++;
            if (guess < numbertoguess) {
                System.out.println("Number is too low, Try again");
            } else if (guess > numbertoguess) {
                System.out.println("Number is too high, Try Again");
            } else {
                System.out.println("You have guessed it right in " + attempts + " attempts");
                break;
            }
        }
    }
}
