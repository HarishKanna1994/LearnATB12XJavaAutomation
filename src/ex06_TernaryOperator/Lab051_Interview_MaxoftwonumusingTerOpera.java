package ex06_TernaryOperator;

public class Lab051_Interview_MaxoftwonumusingTerOpera {
    public static void main(String[] args) {
        //Find the maximum between two numbers
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));
        int max = (x > y) ? x : y;
        System.out.println(max);
    }
}
