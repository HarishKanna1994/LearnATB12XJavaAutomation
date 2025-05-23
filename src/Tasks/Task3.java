package Tasks;

public class Task3 {
    //
    public static void main(String[] args) {
        //To find if a number is odd or even using Ternary Operator
        //Step 1: Input, Output Data Type


        int num = 9;
        //input int
        //Output String -> even or odd
        //Step 2:
        //num%2 == 0 > even else 1 odd
        String num1 = (num%2==0) ? "Num is even" : "Num is odd";
        System.out.println(num1);
        //Edge cases
        //float, negative
    }

}
