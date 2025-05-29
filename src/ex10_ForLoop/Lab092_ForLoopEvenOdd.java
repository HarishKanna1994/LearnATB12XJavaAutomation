package ex10_ForLoop;

public class Lab092_ForLoopEvenOdd {
    public static void main(String[] args) {
        //Program to print both Even and Odd Numbers
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even " +i);
            } else {
                System.out.println("Odd " +i);
            }
        }
    }
}
