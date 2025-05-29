package ex09_Switch;


import java.util.Scanner;

public class Lab068_Switch {
    public static void main(String[] args) {
        //You need to take the User Input and ask for the integer from 1 to 7
        //And if user enters 1 to 7
        //you will tell which day it is

        //Step 1 - Number 1 is using the Scanner class
        //Step 2 - Number two will be figuring out the expression and the day
        //Step 3 - We will basically add step 3 as a rough logic
        //Step 4 - 4 is you will write the logic and optimize
        //Step 5 - Figure out the edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thu");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;

                default:
                    System.out.println("Enter valid day from 1 to 7");

            }
           System.out.println("End of Program1");
        }
            else{
                System.out.println("Why are you entering non integer values");
            }
            System.out.println("End of the Program");
        }
    }


