package ex10_ForLoop;

public class Lab094_ForContinue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Odd"+i);
                continue;
            }
            System.out.println("Even->" +i);
        }
    }
}
