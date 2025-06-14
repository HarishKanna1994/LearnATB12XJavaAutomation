package ex15_Arrays;

import java.util.Scanner;

public class Lab142_Array_UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();

        String[] newmarks = new String[size];
        //int[] newmarks = new int[size];
        //float[] newmarks = new float[size];


        for (int i = 0; i < newmarks.length; i++) {
            System.out.println("Enter the elements" +i);
            newmarks[i]=scanner.next();
        }

        for (String marks : newmarks) {
            System.out.println(marks);
        }
        scanner.close();
    }
}

