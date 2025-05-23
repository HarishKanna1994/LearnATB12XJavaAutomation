package ex06_TernaryOperator;

public class Lab054_In_de_op {
    public static void main(String[] args) {

        //Take inputs
        String age_string = args[0];
        String a1 = args[1];
        //String a2 = args[2];
        //String a3 = args[3];

        int age = Integer.parseInt(age_string);
        System.out.println(age);

        float f1 = Float.parseFloat(a1);
        System.out.println(f1);
        //System.out.println(age_string);
       // System.out.println(a1);
       // System.out.println(a2);
       // System.out.println(a3);

        //If arguments are less = java.lang.ArrayIndexOutOfBoundsException
        //Suppose if we are passing only 2 arguments and we are printing 4 arguments
        // then we are getting Array Index Out Of Bounds Exception
    }
}
