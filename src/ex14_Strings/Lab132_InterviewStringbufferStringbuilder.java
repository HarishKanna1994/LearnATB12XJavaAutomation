package ex14_Strings;

public class Lab132_InterviewStringbufferStringbuilder {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Pramod");
        stringbuffer.append("Dutta");
        System.out.println(stringbuffer);
        //Only one string will be created in String Constant Pool

        String s1 = "Pramod";
        s1 = s1 + "Dutta";
        System.out.println(s1);
        //Two strings will be created in StringConstant Pool
    }
}
