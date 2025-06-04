package ex11_WhileLoop;

import java.util.Scanner;

public class Lab103_WhileFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want");

        if(!scanner.hasNextInt())
        {
            System.out.println("ENter the correct number and rerun");
        }
        int number = scanner.nextInt();
        int factorial = 1;
        //if(number < 0){
           // return -1;
       // }

        if(number <= 0)
        {
            System.out.println("factorial is "+factorial);
        }
        if(number > Integer.MAX_VALUE)
        {
            System.out.println("Number is out of bound");
        }
        int i =1;
            while(i<=number)
            {
                factorial = factorial * i;
                i++;
            }
        System.out.println("factorial of number is " +factorial);
    }
}
