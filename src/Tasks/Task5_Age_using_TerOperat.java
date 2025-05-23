package Tasks;

public class Task5_Age_using_TerOperat {
    public static void main(String[] args) {
        //Find age using Ternary Operator
        int age = 43;
        String s = (age > 18) ? ( age > 65 ? "Senior" : "Adult") : "Minor";
        System.out.println(s);
    }
}
