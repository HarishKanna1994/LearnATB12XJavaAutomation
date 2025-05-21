package ex05_TypeCasting;

public class Lab045_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val Implicit Narrowing -> Data loss will be there
        byte b = (byte) val; // Explicit Narrowing -> Data loss will be there
        System.out.println(b);

    }
}
