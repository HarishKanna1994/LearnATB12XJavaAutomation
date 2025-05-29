package ex10_ForLoop;

public class Lab089_Even_from_Top50 {
    public static void main(String[] args) {

        //To find even numbers from 1 to 50
        //even i%2==0

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even->" +i);
            }
        }
    }
}
