package ex15_Arrays;

import java.util.Arrays;

public class Lab145_2nd_high_number_array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3,4,32};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
