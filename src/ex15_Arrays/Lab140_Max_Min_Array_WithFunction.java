package ex15_Arrays;

public class Lab140_Max_Min_Array_WithFunction {
    public static void main(String[] args) {
        int[] array = {25,14,56,15,36,56,77,18,29,49};
        //Max and Min
        int max_number = give_max_element_array(array);
        System.out.println("Max is" +max_number);
    }

    static int give_max_element_array(int[] array){
        int max = array[0];

        //logic
         for(int i=0;i<array.length;i++)
         {
             if(array[i] > max)
                 max = array[i];
         }
             return max;
    }

}
