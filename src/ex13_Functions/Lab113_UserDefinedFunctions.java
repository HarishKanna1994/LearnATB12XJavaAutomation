package ex13_Functions;

import java.util.Scanner;

public class Lab113_UserDefinedFunctions {
    public static void main(String[] args) {

        //User Defined Functions

        //Without Parameters and without return type
        //Without Parameters and with Return Type
        //With Parameters and without return type
        //With Parameters and with return type

        //1.Without parameters and without return type
        gr_gp_greet();


       //2.Without parameters and with return type
        String msg = gr_gp_greet1();
        System.out.println(msg);

        //3.With parameters and without return type
        greet_with_details("Harish", 30, 50000);
        greet_with_details("Pramod", 35, 65000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = scanner.next();
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();

        greet_with_details(name,age,salary);

        int sum = sum_of_two_nums(5,8);
        int sum1 = sum_of_two_nums(11,15);
        int sum2 = sum_of_two_nums(82,35);
        int sum3 = sum_of_three_nums(200,300,400);

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);


    }
//Without parameters and without return type
    static void gr_gp_greet() {
        System.out.println("Hi Harish");
    }
    //Without parameters and with return type
    static String gr_gp_greet1(){
        System.out.println("Hi Harish");
        return "How are you?";
    }
    //With parameters and without return type
    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("Your Name is " + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }

    //With parameters and with return type
    static int sum_of_two_nums(int a,int b){
        return a+b;
    }
    static int sum_of_three_nums(int a,int b,int c) {

        return a + b + c;
    }
    static float sum_of_three_nums_float(float a, float b, float c){
        return a+b+c;
    }
}
