package ex14_Strings;

public class Lab126_InterviewString5 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);//Index = 0,
        System.out.println(s.codePointAt(0));//Returns the Unicode character

        //CompareToIgnore(String)
        int result = "abc".compareToIgnoreCase("ABC");//result is 0 because of the cases getting ignored
      int result2 = "abc".compareTo("ABC");//result is 32 because of ASCII difference
        System.out.println(result);
       System.out.println(result2);
    }
}
