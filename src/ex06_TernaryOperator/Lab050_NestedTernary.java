package ex06_TernaryOperator;

public class Lab050_NestedTernary {
    public static void main(String[] args) {
        int num = 17;
       String s = (num > 18) ? (num > 25 ? "In Goa, Can Drink" : "In Goa, Can't Drink") : "Can't go to Goa";
        System.out.println(s);
    }
}

