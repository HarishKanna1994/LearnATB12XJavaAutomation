package ex07_IncementDecrementOperator;

import org.w3c.dom.ls.LSOutput;

public class Lab056_PostIncrement_Operator {
    public static void main(String[] args) {
        //Post Increment and then increase
        //int a = 10;
        //System.out.println(++a);
        //System.out.println(a);

        //Post Increment -> Print First and then Increase
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);
    }
}
   //ERT (Expression and Result Table)
// Line No | a_post | b
//   11 | 10 | NA
//   12 | 11 | 10
//   13 | 11 | NA
//   14 | NA | 10


