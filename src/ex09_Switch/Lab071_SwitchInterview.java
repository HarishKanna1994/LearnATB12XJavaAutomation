package ex09_Switch;

public class Lab071_SwitchInterview {
    public static void main(String[] args) {
        char ch = 'A';
        switch(ch)
        {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Not Match ASCII");
        }
    }
}
