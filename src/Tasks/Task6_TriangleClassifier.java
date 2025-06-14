package Tasks;

public class Task6_TriangleClassifier {
    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 3;
        int side3 = 2;

        //Parent check
        if(side1 + side2 > side3 && side1+side3 > side2 && side2 + side3 > side1){

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral Triangle");

        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        }
        else
            {
                System.out.println("Not a valid Triangle");
            }
    }
}
