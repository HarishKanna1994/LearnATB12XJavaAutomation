package ex14_Strings;

public class Lab124_InterviewString3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        //== Comparison -> string -> This checks the reference location
        System.out.println(s1==s3);
        System.out.println(s1==s2);//One is in String Constant pool and another is in Object Area So false
        System.out.println(s2==s3);//Both are different areas in Object area so not equal it is false
        System.out.println(s1==s4);//True because both the strings s1 and s4 points to Hello
        System.out.println(s3==s5);//False because content is different and they are of different locations in Object area

        //equals -> It will compare the content
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
