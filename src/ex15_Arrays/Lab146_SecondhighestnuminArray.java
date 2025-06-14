package ex15_Arrays;

public class Lab146_SecondhighestnuminArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int highest = 0;
        int secondhighest = 0;

        for (int num : numbers) {
            if (num > highest) {
                secondhighest = highest;
                highest = num;
            } else if (num > secondhighest && num != highest)
                {
                    secondhighest = num;
                }
            }


            System.out.println("secondhighest is" + secondhighest);

        }
    }
