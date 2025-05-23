package ex05_TypeCasting;

public class Lab047_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course + GST;   //Implicit Narrowing
       int total1 = course + (int)GST;//Explicit Narrowing
        System.out.println(total1);

        float total2 = course + GST;//Implicit Widening
        System.out.println(total2);
        float total3 = (float)course + GST;//Explicit Widening
        System.out.println(total3);
    }
}
