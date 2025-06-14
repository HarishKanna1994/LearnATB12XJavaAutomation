package ex14_Strings;

public class Lab125_InterviewString4 {
    public static void main(String[] args) {
       // String s1 = "HELLO"; //-> This is created in String Constant Pool
       // String s2 = new String("World"); //-> This is created in Object Area

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.concat(s3));// This will be stored in String Constant Pool


    }
}
