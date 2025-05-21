package ex05_TypeCasting;

public class Lab044_Typecasting {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; //Valid Syntax -> Widening Implicit casting -> Automatically done by the compiler
        int a1 = (int) b; // Widening Explicit casting -> Optional
    }
}
