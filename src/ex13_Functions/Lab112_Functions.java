package ex13_Functions;

public class Lab112_Functions {
    public static void main(String[] args) {
      int r1 = sum_of_two_numbers(5,8);
      int r2 = sum_of_two_numbers(13,45);
        System.out.println(r1);
        System.out.println(r2);
    }

 static int sum_of_two_numbers(int first, int second) {
     return first + second;
 }

}
