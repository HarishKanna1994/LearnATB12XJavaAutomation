package ex07_IncementDecrementOperator;

public class Lab059_AdvanceIncDecOpera {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        //A + B
        //A -> a++ -> Exp A -> 10 , a->11
        //+
        //B -> a -> Exp B -> 11
    }
}




//ERT Table
//LineNo | a | Exp
// 5 | 10 | NA
// 6 | NA | 10 + 11 -> 21
