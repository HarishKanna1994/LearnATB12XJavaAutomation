package ex14_Strings;

public class Lab127_InterviewString6 {
    public static void main(String[] args) {
       int index = "Java".indexOf("a");
        System.out.println(index);
        boolean b = "".isEmpty();
        System.out.println(b);
        String s11 = String.join("-","Java","Python");
        System.out.println(s11);

        String s12 = "Java".replace('a','o');
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);
    }
}
