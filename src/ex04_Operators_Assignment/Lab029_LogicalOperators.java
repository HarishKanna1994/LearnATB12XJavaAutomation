package ex04_Operators_Assignment;

public class Lab029_LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        boolean b = true;
        System.out.println(!!b); //Even Nots cancel each other
        boolean c = true || false;
        System.out.println(c);
        boolean c1 = false && true;
        System.out.println(c1);
    }
}
