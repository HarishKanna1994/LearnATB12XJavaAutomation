package ex09_Switch;

public class Lab076_MultiplestatementsinSwitchcase {
    public static void main(String[] args) {
        int itemCode = 004;
        switch(itemCode)
        {
            case 001,002,003:

                System.out.println("All are electronic gadgets");
                break;

            case 004,005,006:

                System.out.println("This is Mech");
                break;

            default:
                System.out.println("None");

        }
    }
}
