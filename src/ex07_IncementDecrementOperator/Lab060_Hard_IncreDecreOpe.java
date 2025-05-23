package ex07_IncementDecrementOperator;

public class Lab060_Hard_IncreDecreOpe {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
    }
}
//a++ -> ExpA -> 10,      a->11
//+
//++a -> ExpB -> 12,    a-12