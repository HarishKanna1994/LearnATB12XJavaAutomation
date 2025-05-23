package ex06_TernaryOperator;

public class Lab053_RealAgeClassification {
    public static void main(String[] args) {
        //age = 23   age<18 Minor age > 18 Adult  age>65 Senior
        //int age = 23;
        String user_input = args[0];
        System.out.println(user_input);
        int age = Integer.parseInt(user_input);
        System.out.println(age);
        String result = (age < 18) ? "Minor" : (age < 65 ) ? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
