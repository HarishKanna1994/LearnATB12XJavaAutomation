package ex15_Arrays;

public class Lab139_Array_Print {
    public static void main(String[] args) {
        int[] marks = {51, 100, 98, 65, 35};
        {
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
            System.out.println(marks[4]);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);


        }

        //Enhanced For Loop
        for(int mark : marks)
        {
            System.out.println(mark);
        }
    }
}
