package ex14_Strings;

public class Lab123_StringInterview2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
                String s3 = "Hello";
                String s4 = "hello";
                //Two Strings are present in String Constant Pool

        String s5 = new String("Hello");
        String s6 = new String("Hello");
        //Two strings are present in Object Area because new operator always create new strings
        String s7 = new String("hello");
        //Three strings are present in Object Area because new operator always create new strings in the memory
    }
}
