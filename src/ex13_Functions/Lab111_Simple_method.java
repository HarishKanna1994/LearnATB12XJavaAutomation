package ex13_Functions;

public class Lab111_Simple_method {
    public static void main(String[] args) {

        //Non return type or void does not return anything
        non_return_type();

        int a = return_type();
        System.out.println(a);
        String b = return_type1();
        System.out.println(b);
    }

    //Non return type function does not return anything, only printing
    static void non_return_type(){
        System.out.println("Hi I'm of non return type");
    }

    //Return type function, it will return a particular datatype
    static int return_type(){
        System.out.println("Hi I'm of return type");
        return 10;
    }
    static String return_type1(){
        System.out.println("Hi I'm of return type");
        return "HarishKanna";
    }

   /* static boolean return_boolean(){
            return boolean;
    }
    static float return_float(){
        return 10.35f;
    }
    static byte return_byte(){
        return 100;
    }
    static long return_long(){
        return 17.83l;
    }*/

}
