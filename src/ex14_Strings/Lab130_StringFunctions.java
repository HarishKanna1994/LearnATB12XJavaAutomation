package ex14_Strings;

public class Lab130_StringFunctions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(10));
        System.out.println(name.concat("Patel"));
        System.out.println(name.contains("on"));
        System.out.println(name.equals("Sonal"));
        System.out.println(name.equalsIgnoreCase("sonal"));
        System.out.println(name.indexOf("o"));
        String s1 = "madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(name.replace('o','A'));

    }
}
