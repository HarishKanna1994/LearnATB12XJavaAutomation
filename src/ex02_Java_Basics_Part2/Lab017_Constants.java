package ex02_Java_Basics_Part2;

public class Lab017_Constants {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        final int b = 11;
        System.out.println(b);
        //b= 12; java: cannot assign a value to final variable b
        //we can't change the value of the final variable
        final float c = 3.14f;
        System.out.println(c);
    }
}
