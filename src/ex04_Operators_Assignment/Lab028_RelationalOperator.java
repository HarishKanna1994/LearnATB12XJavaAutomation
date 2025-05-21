package ex04_Operators_Assignment;

public class Lab028_RelationalOperator {
    public static void main(String[] args) {
//        < Less than
//        <= Less than or equal to
//        > Greater than
//        >= Greater than or equal to
//        == Equal to (but checking)
//        != Not equal to

        //All of them will result in boolean output
        int a = 10;
        int b= 20;
        boolean c = a > b;// 10> 20
        System.out.println(c);

        int age_mamitha = 33;
        int age_Pramod = 34;
        boolean result = age_Pramod >= age_mamitha; //age_Pramod > age_mamitha or age_Pramod = age_mamitha
        System.out.print(result);

    }
}
