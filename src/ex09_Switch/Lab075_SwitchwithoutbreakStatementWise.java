package ex09_Switch;

public class Lab075_SwitchwithoutbreakStatementWise {
    public static void main(String[] args) {
        int itemCode = 001;
        switch(itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("default");
        }
    }
}
