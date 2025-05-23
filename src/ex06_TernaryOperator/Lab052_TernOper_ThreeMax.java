package ex06_TernaryOperator;

public class Lab052_TernOper_ThreeMax {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Logic Building Formula

        //Step 1 -> Find the input and output data type
        //I/P -> n1,n2,n3 -> int
        //O/P -> int max number or String we can message with max number

        //Rough logic, Think about it
        // n1> n2 && n1 > n3 -> n1
        // n2 > n1 && n2> n3 -> n2
        //n3

        //Step 3 Dry run the program
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);


    }
}
