package ex13_Functions;

import java.util.Scanner;

public class Lab116_TriangClassScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int side1 = scanner.nextInt();

        System.out.println("Enter num2");
        int side2 = scanner.nextInt();

        System.out.println("Enter Num3");
        int side3 = scanner.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a valid Triangle");
        }
    }
}
