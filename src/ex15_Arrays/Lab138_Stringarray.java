package ex15_Arrays;

public class Lab138_Stringarray {
    public static void main(String[] args) {
        String[] names = {"Pramod","Amit","Lucky"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] name_atb12x = new String[3];
        name_atb12x[0] = "Aditi";
        name_atb12x[1] = "Jitin";
        name_atb12x[2] = "Nikita";
        System.out.println(name_atb12x.length);
        System.out.println(name_atb12x[0]);
        System.out.println(name_atb12x[1]);
        System.out.println(name_atb12x[2]);

        boolean[] is_male = new boolean[2];
        is_male[0] = true;
        is_male[1] = false;

    }
}
