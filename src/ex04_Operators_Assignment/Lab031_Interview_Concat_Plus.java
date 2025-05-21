package ex04_Operators_Assignment;

public class Lab031_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Harish";
        String last_name = "Kanna";

        int a = 10;
        int b= 10;
        System.out.println(first_name + last_name + a + b); //+ operator is acting as a joiner
        System.out.println(a + b + first_name + last_name); //= operator acts as Merging and Joining
        System.out.println(first_name + last_name + (a + b));//BODMAS
    }
}
