import java.util.Scanner;
import java.lang.Math;
public class GreaterNumber {
    static int graterBetweenMath(int x, int y){
        return Math.max(x, y);
    }
    static int graterBetween(int x, int y){
        return (x > y) ? x : y;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int x, y;
        x = in.nextInt();
        y = in.nextInt();

        int res1 = graterBetween(x,y);
        int res2 = graterBetweenMath(x,y);

        System.out.println("The Grater number is : " + res1);
        System.out.println("The Grater number is (using Math) : "+res2);
    }
}
