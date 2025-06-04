package ex13_Functions;

import java.util.Scanner;

public class Lab114_CalculatorArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a=0;
        if (scanner.hasNext()) {
            a = scanner.nextInt();

        } else {
            System.out.println("Enter the integer only");
            System.exit(0);
        }
        System.out.println("Enter the Num2");
        int b=0;
        if (scanner.hasNext()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter integer only");
            System.exit(0);
        }

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = multiply(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);
    }

   static int sum(int a, int b)
   {
       return a+b;
   }
   static int sub(int a, int b)
   {
       return a-b;
   }
   static int multiply(int a,int b)
   {
       return a*b;
   }
   static int div(int a, int b) throws ArithmeticException{
       if (b==0) {
       throw new ArithmeticException("Division of a/b is not allowed");
       }
       return a/b;
   }
   static int mod(int a, int b){
        return a%b;
   }

}
