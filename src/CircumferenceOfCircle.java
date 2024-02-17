import java.lang.Math;
import java.util.Scanner;
public class CircumferenceOfCircle {
    static double circumference(double r){
        double C = 2 * Math.PI * r;
        return C;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius of the circle : ");
        double r = in.nextDouble();
        System.out.println("The radius provided is : "+ r);
        System.out.printf("The Circumference is : %.2f", circumference(r));
    }
}
