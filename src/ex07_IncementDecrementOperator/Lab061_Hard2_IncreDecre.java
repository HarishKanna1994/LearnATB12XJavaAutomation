package ex07_IncementDecrementOperator;

public class Lab061_Hard2_IncreDecre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //++a -> A -> ExpA -> 11, a -> 11
        //+
        //++a -> B -> ExpB -> 12, a -> 12
        //Exp A + Exp B -> 11 + 12 -> 23, a->12

    }
}
